package com.example.first02

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.et_id
import kotlinx.android.synthetic.main.activity_login.et_pwd
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        join.setOnClickListener {
            if(et_id.text.isNullOrBlank()||et_pwd.text.isNullOrBlank()){
                Toast.makeText(this,"아이디와 비밀번호를 확인하세요", Toast.LENGTH_SHORT).show()
            }else{
                intent.putExtra("id", et_id.text.toString())
                intent.putExtra("pwd", et_pwd.text.toString())
                setResult(Activity.RESULT_OK, intent)
                finish()
            }
        }
    }
}
