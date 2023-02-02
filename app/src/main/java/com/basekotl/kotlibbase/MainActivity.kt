package com.basekotl.kotlibbase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.basekotl.kotlibbase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val TAG: String = MainActivity::class.toString()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //print variables
        printVars()

        //print arithmetic operators
        printArithmaticOperations()


        binding.alarmbutton.setOnClickListener {

            val intent = Intent(this, AlarmActivity::class.java)
            startActivity(intent)
        }


    }

    private fun printVars() {

        val finalStaticVar = "testString"  // it can not be reassigned.
        // finalStaticVar="reAssignedString" //gives error

        //to overcome this - we can assigned a value with their datatypes
        var score: Int = 10
        var isRaining: Boolean = false
        var fruit: String = "Apple"
        var word: Char = 'a'
        var temprature: Double = 78.8


        Log.e(TAG, "printVars: " + "Welcome To CheezyCode")
        Log.e(TAG, "printVars: " + (2 + 3.5))
        Log.e(TAG, "printVars: " + false)

    }


    private fun printArithmaticOperations() {


    }



}