package com.stackmobile.aplicativodeteste.view.telaprincipal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.stackmobile.aplicativodeteste.R
import com.stackmobile.aplicativodeteste.databinding.ActivityTelaPrincipalBinding
import com.stackmobile.aplicativodeteste.view.formlogin.FormLogin

class TelaPrincipal : AppCompatActivity() {
    lateinit var binding: ActivityTelaPrincipalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btLogouth.setOnClickListener {
            FirebaseAuth.getInstance().signOut()

            var intent = Intent(this, FormLogin::class.java)
            startActivity(intent)
            finish()
        }
    }
}