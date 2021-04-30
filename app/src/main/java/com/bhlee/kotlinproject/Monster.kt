package com.bhlee.kotlinproject

import android.util.Log

open class Monster (var name:String, var damage:Int, var health:Int, var type:String){
    fun info(){
        Log.d("Monster", "이름: ${name}, 공격력: ${damage}, 체력: ${health}, 타입: ${type}")
    }
}

class FireMonster (name:String, damage:Int, health:Int) : Monster (name, damage, health, "Fire"){

}

class WaterMonster (name:String, damage:Int, health:Int) : Monster (name, damage, health, "Water"){

}

class WindMonster (name:String, damage:Int, health:Int) : Monster (name, damage, health, "Wind"){

}