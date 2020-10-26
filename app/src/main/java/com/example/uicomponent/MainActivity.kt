package com.example.uicomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nama = findViewById<EditText>(R.id.editNama)
        val imgBtn = findViewById<ImageButton>(R.id.imgButtonAdd)
        val imgBtnReset = findViewById<ImageButton>(R.id.imgButtonCancel)

        imgBtn.setOnClickListener {
            Toast.makeText(this@MainActivity, "Berhasil", Toast.LENGTH_SHORT).show()
        }

        imgBtnReset.setOnClickListener {
            nama.setText("")
        }

    }
}