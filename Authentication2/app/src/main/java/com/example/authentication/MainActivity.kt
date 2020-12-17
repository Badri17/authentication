package com.example.authentication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var inputEmail:EditText
    private lateinit var inputPassword:EditText
    private lateinit var loginButton: Button
    private lateinit var registrationButton: Button
    private lateinit var passwordResetButton: Button

    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesrsonal_info)
        mAuth= FirebaseAuth.getInstance()

        inputEmail = findViewById(R.id.signInEmailEditText)
        inputPassword = findViewById(R.id.signPasswordEditText)
        loginButton = findViewById(R.id.signInButton)
        registrationButton = findViewById(R.id.gotoRegistrationButton)
        passwordResetButton = findViewById(R.id.gotoPasswordResetButton)

        loginButton.setOnClickListener {
            val email = inputEmail.text.toString()
            val password = inputPassword.text.toString()
            if (email.isEmpty() or password.isEmpty())
                Toast.makeText(this, "empty", LENGHT.SHORT).show()


        }else{
            mAuth.createUserWithEmailAndPassword(Email,Password).addOnCompleteListener { task ->
                if (task.isSuccessful)
                    startActivity(Intent(this, MainActivity::class.java))
                finish()
            }else}
            Toast.makeText(this,"error" ,LENGHT.SHORT).show()


            }

        registrationButton.setOnClickListener {
            startActivity(Intent(this,registration::class.java))

        }
        passwordResetButton.setOnClickListener {
            //ToDo

        }
    }

}