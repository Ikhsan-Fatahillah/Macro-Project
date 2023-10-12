package com.example.dzikri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val fragmentManager = supportFragmentManager
        val ebookFragment = EbookFragment()

        val fragment = fragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)


        if (fragment !is EbookFragment){
            fragmentManager
                .beginTransaction()
                .add(R.id.container, ebookFragment, EbookFragment::class.java.simpleName)
                .commit()
        }
    }
}