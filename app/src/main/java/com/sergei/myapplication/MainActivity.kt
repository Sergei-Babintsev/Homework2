package com.sergei.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"Везувий зев открыл — дым хлынул клубом — пламя")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"Широко развилось, как боевое знамя.")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"Земля волнуется — с шатнувшихся колонн")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"Кумиры падают! Народ, гонимый страхом,")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"Под каменным дождем, под воспаленным прахом,")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"Везувий зев открыл — дым хлынул клубом — пламя")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"Толпами, стар и млад, бежит из града вон.")
    }


}