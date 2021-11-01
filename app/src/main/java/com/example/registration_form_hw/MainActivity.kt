package com.example.registration_form_hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

   private lateinit var name : EditText
   private lateinit var email: EditText
   private lateinit var password : EditText
   private lateinit var confirmPassword :EditText
   private lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        confirmPassword = findViewById(R.id.confirmPassword)

        button = findViewById(R.id.button)

        button.setOnClickListener {

            val userName = name.text.toString().trim()
            val userEmail = email.text.toString().trim()
            val userPassword = password.text.toString().trim()
            val userRePassword = confirmPassword.text.toString().trim()

            if (userName.isEmpty()){
               name.error = "Name Required"
                return@setOnClickListener
            }else if (userEmail.isEmpty()){
                email.error = "Email Required"
                return@setOnClickListener
            }else if(userPassword.isEmpty()){
                password.error = "Password Required"
                return@setOnClickListener
            }else if (userRePassword.isEmpty()){
                confirmPassword.error = "Re-Enter Password Required"
                return@setOnClickListener
            }else{
                Toast.makeText(this,"validtion",Toast.LENGTH_LONG).show()
            }



            }


     }
}