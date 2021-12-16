package com.example.laba2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.Toast

const val NCREATE = "Activity CREATED"
const val NSTART = "Activity STARTED"
const val NRESUME = "Activity RESUME"
const val NPAUSE = "Activity PAUSED"
const val NSTOP = "Activity STOPPED"
const val NRESTART = "Activity RESTARTED"
const val NDESTROY = "Activity DESTROYED"

class MainActivity : AppCompatActivity() {
    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        //setContentView(R.layout.activity_main)
        val t = Toast.makeText(this,NCREATE,Toast.LENGTH_SHORT)
        //t.setGravity(Gravity.CENTER_VERTICAL,0,0)
        t.show()

    }
    override fun onStart() {
        super.onStart()
        //setContentView(R.layout.activity_main)
        val t = Toast.makeText(this,NSTART,Toast.LENGTH_SHORT)
        t.setGravity(Gravity.LEFT,0,0)
        t.show()
    }

    override fun onResume() {
        super.onResume()
        //setContentView(R.layout.activity_main)
        val t = Toast.makeText(this,NRESUME,Toast.LENGTH_SHORT)
        t.setGravity(Gravity.TOP,0,0)
        t.show()
    }

    override fun onPause() {
        super.onPause()
        //setContentView(R.layout.activity_main)
        val t = Toast.makeText(this, NPAUSE,Toast.LENGTH_SHORT)
        t.setGravity(Gravity.RIGHT,0,0)
        t.show()
    }

    override fun onStop() {
        super.onStop()
        //setContentView(R.layout.activity_main)
        val t = Toast.makeText(this, NSTOP,Toast.LENGTH_SHORT)
        t.setGravity(Gravity.CENTER,0,0)
        t.show()
    }

    override fun onRestart() {
        super.onRestart()
        //setContentView(R.layout.activity_main)
        val t = Toast.makeText(this, NRESTART,Toast.LENGTH_SHORT)
        t.setGravity(Gravity.FILL_HORIZONTAL,0,0)
        t.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        //setContentView(R.layout.activity_main)
        val t = Toast.makeText(this, NDESTROY,Toast.LENGTH_SHORT)
        t.setGravity(Gravity.FILL,0,0)
        t.show()
    }

    //private val TAG = "condition"
    //fun showMessage(s: String){
        //Toast.makeText(this,s, Toast.LENGTH_SHORT).show()
        //Log.d(TAG, s)
    //}
}