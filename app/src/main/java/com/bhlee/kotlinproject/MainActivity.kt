package com.bhlee.kotlinproject

import android.annotation.SuppressLint
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

@SuppressLint("StaticFieldLeak")
class MainActivity : AppCompatActivity() {

    lateinit var db : UserProfileDatabase
    var UserProfileList = listOf<UserProfile>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        db = UserProfileDatabase.getInstance(this)!!

        button.setOnClickListener {
            val user = UserProfile(null,editText.text.toString())
            insertData(user)
        }
    }

    fun insertData(user : UserProfile){
        val insertTask = object : AsyncTask<Unit, Unit, Unit>(){
            override fun doInBackground(vararg params: Unit?) {
                db.getUserProfileDao().insert(user)
            }

            override fun onPostExecute(result: Unit?) {
                super.onPostExecute(result)
                getAllDatas()
            }
        }
        insertTask.execute()
    }


    fun getAllDatas(){
        val getTask = object : AsyncTask<Unit, Unit, Unit>(){
            override fun doInBackground(vararg params: Unit?) {
                UserProfileList = db.getUserProfileDao().getAll()
            }

            override fun onPostExecute(result: Unit?) {
                super.onPostExecute(result)

            }
        }
        getTask.execute()
    }

    fun deleteData(){

    }

    fun updateData(){

    }

}