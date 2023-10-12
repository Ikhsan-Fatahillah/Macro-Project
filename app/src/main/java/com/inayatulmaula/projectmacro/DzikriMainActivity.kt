package com.inayatulmaula.projectmacro

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikri_main)
        val btnshare: Button = findViewById(R.id.button_share)
        btnshare.setOnClickListener(this)

        val btnebook: Button = findViewById(R.id.button_ebook)
        btnebook.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id){
                R.id.button_share -> {
                    val message = "Bagikan Aplikasi ini Ke teman teman mu"
                    val intent = Intent()
                    intent.action = Intent.ACTION_SEND
                    intent.putExtra(Intent.EXTRA_TEXT, message)
                    intent.type = "text/plain"
                    startActivity(intent)
                }

                R.id.button_ebook -> {
                    val intent = Intent(this@MainActivity, TestActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}