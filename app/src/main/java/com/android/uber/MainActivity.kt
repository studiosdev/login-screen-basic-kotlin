package com.android.uber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            val showSigned = signIn(edtEmail.text.toString(), edtPassword.text.toString())
            if(showSigned) {
                Toast.makeText(this, "Logueado", Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(this, "Complete los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun signIn(edtEmail: String, edtPassword: String): Boolean {
        return edtEmail.isNotEmpty() && edtPassword.isNotEmpty()
    }
}
