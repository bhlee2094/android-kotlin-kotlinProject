package com.bhlee.kotlinproject


open class Monster (var name:String, var damage:Int, var health:Int, var type:String){

}

class FireMonster (name:String, damage:Int, health:Int) : Monster (name, damage, health, "Fire"){

}

class WaterMonster (name:String, damage:Int, health:Int) : Monster (name, damage, health, "Water"){

}

class WindMonster (name:String, damage:Int, health:Int) : Monster (name, damage, health, "Wind"){

}