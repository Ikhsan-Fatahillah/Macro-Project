package com.example.dzikri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class BuatAkunActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buat_akun)

        val buttonBuatAkun = findViewById<Button>(R.id.button_buat_akun)
        buttonBuatAkun.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.button_buat_akun -> {
                val intent = Intent(this@BuatAkunActivity, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}