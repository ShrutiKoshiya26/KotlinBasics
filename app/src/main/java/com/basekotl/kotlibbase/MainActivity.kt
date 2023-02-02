package com.basekotl.kotlibbase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG :String=MainActivity::class.toString()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //print variables
        printVars()

        //print arithmetic operators
        printArithmaticOperations()

    }

    private fun printVars() {

        val finalStaticVar = "testString"  // it can not be reassigned.
        // finalStaticVar="reAssignedString" //gives error

        //to overcome this - we can assigned a value with their datatypes
        var score: Int = 10
        var isRaining: Boolean = false
        var fruit: String = "Mango"
        var word: Char = 'a'
        var temprature: Double = 78.8


        Log.e(TAG, "printVars: " + "Welcome To CheezyCode")
        Log.e(TAG, "printVars: " + (2 + 3.5))
        Log.e(TAG, "printVars: " + false)

    }


    private fun printArithmaticOperations() {


    }
}