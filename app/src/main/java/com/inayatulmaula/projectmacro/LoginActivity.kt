package com.inayatulmaula.projectmacro

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etEmail:EditText
    private lateinit var etPassword:EditText
    private lateinit var history:TextView

    private val resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
        result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data:Intent? = result.data
            val returnString:String? = data?.getStringExtra("History")
            history.text = returnString
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        etEmail = findViewById(R.id.editTextEmail)
        etPassword = findViewById(R.id.editTextPassword)

        val bundle = intent.extras
        if (bundle != null) {
            etEmail.setText(bundle.getString("email"))
            etPassword.setText(bundle.getString("Password"))
        }

        val btnsignUp = findViewById<Button>(R.id.button_sign_up)
        btnsignUp.setOnClickListener(this)

        val btnlogin = findViewById<Button>(R.id.button_Login)
        btnlogin.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.button_Login -> {
                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                intent.putExtra("User", User(etEmail.text.toString(), etPassword.toString()))
                resultLauncher.launch(intent)
            }

            R.id.button_sign_up -> {
                val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
                startActivity(intent)
            }

            R.id.button_Login -> {
                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }
        val intent = Intent()
        intent.putExtra("history", "Anda sudah login")
        setResult(RESULT_OK,intent)
        finish()
    }
}