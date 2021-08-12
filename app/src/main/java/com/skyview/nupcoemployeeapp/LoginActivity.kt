package com.skyview.nupcoemployeeapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val companyEmail = findViewById<TextInputLayout>(R.id.companyEmail)
        val password = findViewById<TextInputLayout>(R.id.password)
        val forgetPassword = findViewById<TextView>(R.id.forgetPassword)
        val login=findViewById<Button>(R.id.login)

        forgetPassword.setOnClickListener {
            val intent = Intent(this@LoginActivity, SignUp::class.java)
            startActivity(intent)
            finish()
        }
        login.setOnClickListener {
            val intent = Intent(this@LoginActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}