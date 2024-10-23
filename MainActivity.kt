package com.lab5.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.lab5.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(R.layout.activity_main)
        setContentView(binding.root)

//        val emailField: TextInputEditText = findViewById(R.id.et_email)
//        val editPassword: TextInputEditText = findViewById(R.id.et_password)
//        val btnLogin: Button = findViewById(R.id.btn_login)

        val correctEmail = "admin@mail.com"
        val correctPassword = "admin"

        binding.btnRegister.setOnClickListener{
            val email = binding.etUsername.text.toString()
            val password = binding.etPassword.text.toString()

            if (correctEmail == email && correctPassword == password) {
                Toast
                    .makeText(this,"Login Successful", Toast.LENGTH_SHORT)
                    .show()
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            } else {
                Toast
                    .makeText(this,"Username or Password is incorrect", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}