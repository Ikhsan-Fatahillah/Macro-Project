package com.inayatulmaula.projectmacro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.dzikri.TestActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNext : Button = findViewById(R.id.btnNext)
        btnNext.setOnClickListener(this)

        val btnSkip : Button = findViewById(R.id.btnSkip)
        btnNext.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnNext -> {
                val intent = Intent(this, halamanDepan1::class.java)
                startActivity(intent)
            }

            R.id.btnSkip -> {
                val intent = Intent(this, loginActivity::class.java)
                startActivity(intent)
            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
