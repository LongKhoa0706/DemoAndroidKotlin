package com.longkhoa.demokotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onStart() {
        super.onStart()
        Log.d("11","Onstart")
    }



    override fun onDestroy() {
        super.onDestroy()
        Log.d("11","OnDestroy")
    }

    override fun onResume() {
        super.onResume()
        Log.d("11","OnResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("11","Onrestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("11","Onpause")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d("11","Runinngggggg")
        findViewById<Button>(R.id.btnOK).setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.apply {
                putExtra("abc123","abc")
            }
            startActivity(intent)
        }
        val intent = Intent()
        intent.putExtra("abc","LLLLLLL")
        setResult(Activity.RESULT_OK,intent)
        finish()
    }
}
