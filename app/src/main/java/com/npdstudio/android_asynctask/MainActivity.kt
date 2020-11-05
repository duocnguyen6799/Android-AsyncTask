package com.npdstudio.android_asynctask

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var btnDownload = findViewById<Button>(R.id.btnDownload)
    var txtProgress = findViewById<TextView>(R.id.txtProgress)
    var progress = findViewById<ProgressBar>(R.id.progress)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        progress.max = 100
        progress.progress = 0
    }
    fun setStateProgressBar(percent:Int){
        progress.progress = percent
    }
    class DownloadTask : AsyncTask<Void, Void, Void>() {
        override fun doInBackground(vararg params: Void?): Void {
            for(i in 1..100){
                SystemClock.sleep(100)
                
            }
        }

    }
}