package com.longkhoa.demokotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var edt1 : EditText
    lateinit var edt2 : EditText
    lateinit var edt3 : EditText
    lateinit var btnTotal : Button
    lateinit var txtTotal : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        anhXa()
        val abc = intent.getStringExtra("abc123")
        txtTotal.text = abc
        btnTotal.setOnClickListener {
            val num1 = edt1.editableText.toString()
            val num2 = edt2.editableText.toString()
            val num3 = edt3.editableText.toString()
            val total = num1.toInt() + num2.toInt() + num3.toInt()

        }

        findViewById<Button>(R.id.btnResult).setOnClickListener {
            val intent = Intent(this,Main2Activity::class.java)
            intent.apply {
                putExtra("av","llllll")
            }
            startActivityForResult(intent,REQUESTCODE.request)

        }

    }
    private fun anhXa(){
        edt1 = findViewById(R.id.edt1)
        edt2 = findViewById(R.id.edt2)
        edt3 = findViewById(R.id.edt3)
        btnTotal = findViewById(R.id.btnTotal)
        txtTotal = findViewById(R.id.txtTotal)
    }
    object REQUESTCODE {
        val request = 1;
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQUESTCODE.request){
            if (resultCode == Activity.RESULT_OK){
             val msg =     data?.getStringExtra("abc")
                msg.let {
                    Toast.makeText(this,it,Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

}
