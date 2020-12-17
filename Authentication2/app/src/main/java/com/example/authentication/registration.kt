package com.example.authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class registration : AppCompatActivity() {
    private lateinit var inputEmail:EditText
    private lateinit var inputPassword:EditText
    private lateinit var registrationButton: Button

    private lateinit var mAuth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        mAuth= FirebaseAuth.getInstance()

        inputEmail=findViewById(R.id.signUpEmailEditText)
        inputPassword=findViewById(R.id.signUpPasswordEditText)
        registrationButton=findViewById(R.id.signUpButton)

        registrationButton.setOnClickListener {
            val Email=inputEmail.text.toString()
            val Password=inputPassword.text.toString()
            if (Email.isEmpty()  or Password.isEmpty()){
                Toast.makeText(this,"empty" ,LENGHT.SHORT).show()



                }
            }

        }



    }
