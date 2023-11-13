package com.lalorosas.retirementcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes
import kotlinx.android.synthetic.main.activity_main.calculateButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AppCenter.start(application, "15bc904d-11db-4ab0-979e-2246f74a9c4c", Analytics::class.java, Crashes::class.java);
        calculateButton.setOnClickListener {
            Analytics.trackEvent("AAA")
        }

    }
}
