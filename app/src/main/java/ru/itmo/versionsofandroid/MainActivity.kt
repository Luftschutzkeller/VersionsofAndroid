package ru.itmo.versionsofandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.itmo.versionsofandroid.data.DataStorage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val android = DataStorage.getVersionList()
        val adapter = AndroidAdapter(this, android)
    }
}