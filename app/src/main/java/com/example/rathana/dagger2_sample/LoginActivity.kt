package com.example.rathana.dagger2_sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.rathana.dagger2_sample.util.ToastUtil

class LoginActivity : AppCompatActivity() {

    lateinit var etUserId : EditText
    lateinit var btnLogin : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        etUserId=findViewById(R.id.userId)
        btnLogin=findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener({
            val userId=etUserId.text.toString()
            if(userId.isNotEmpty())
                ToastUtil(LoginActivity@this).showMessage("valid User")
            else
                ToastUtil(LoginActivity@this).showMessage("user ID is empty")
        })
    }
}
