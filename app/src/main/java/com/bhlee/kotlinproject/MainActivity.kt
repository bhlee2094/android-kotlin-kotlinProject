package com.bhlee.kotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fireMonster1 = FireMonster("불씨", 1, 5);
        var waterMonster1 = WaterMonster("방울", 1, 5);
        var windMonster1 = WindMonster("살랑", 1, 5);

        val toolbar = findViewById<Toolbar>(R.id.toolbar) // 상단 toolbar
        setSupportActionBar(toolbar)
        val actionbar = supportActionBar!!
        actionbar.setDisplayShowTitleEnabled(false)

        var mainTextView = findViewById<TextView>(R.id.MainTextView)
        mainTextView.setText("몬스터 이름: " + fireMonster1.name + ", 몬스터 공격력: " + fireMonster1.damage + ", 몬스터 체력: " + fireMonster1.health + "\n")
        mainTextView.append("몬스터 이름: " + waterMonster1.name + ", 몬스터 공격력: " + waterMonster1.damage + ", 몬스터 체력: " + waterMonster1.health + "\n")
        mainTextView.append("몬스터 이름: " + windMonster1.name + ", 몬스터 공격력: " + windMonster1.damage + ", 몬스터 체력: " + windMonster1.health + "\n")
    }

}