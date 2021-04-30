package com.bhlee.kotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fireMonster1 = FireMonster("불씨", 1, 5);
        var waterMonster1 = WaterMonster("방울", 1, 5);
        var windMonster1 = WindMonster("살랑", 1, 5);
        fireMonster1.info()
        waterMonster1.info()
        windMonster1.info()
    }

}