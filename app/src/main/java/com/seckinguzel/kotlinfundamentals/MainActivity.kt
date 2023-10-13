package com.seckinguzel.kotlinfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Hello Kotlin!")
        println("////")

        println(5 * 10)
        println("////")

        println("----------------Variables----------------")

        //Variables
        var a = 3
        var b = 5
        println(a * b);
        println("////")

        var age = 50
        println(age / 5 * 8)
        println("////")

        age = 60
        println(age / 5 * 8)
        println("////")

        val x = 10
        val y = 20
        println(x + y)
        println("////")

        val pi = 3.14
        val r = 1.8
        val squareArea = pi * r * r
        println(squareArea)
        println("////")

        val piFloat: Float = 3.14f
        println(piFloat * 0.5)
        println("////")

        println("----------------ChangingTypes----------------")

        //Changing types of variables
        var myInt = 10
        val myChangedIntToLong = myInt.toLong();
        val myChangedIntToString = myInt.toString();
        println(myChangedIntToLong)
        println(myChangedIntToString)
        println("////")

        var myBoolean = true
        val c = myBoolean.toString();
        println(c)
        println("////")

        println("----------------Array----------------")

        //Array
        val myArray = arrayOf("Seckin", "Guzel", "Tuncay", "Guzel")
        println(myArray.get(1))
        myArray.set(1, "Can")
        println(myArray.get(1))
        println("////")

        val myNumberArray = doubleArrayOf(1.38, 1.45, 2.78, 3.33)
        println(myNumberArray.get(0))
        println("////")

        val mixedArray = arrayOf("Seckin", 24, 16.5, true, false)
        println(mixedArray.get(3))
        println("////")

        println("----------------ArrayList----------------")

        //ArrayList
        val nameList = arrayListOf<String>("Seckin", "Guzel", "Tuncay")
        nameList.add(3, "Gulseren")
        println(nameList)
        println("////")

        val mixedArrayList = arrayListOf<Any>()
        mixedArrayList.add("Seckin")
        mixedArrayList.add("Guzel")
        mixedArrayList.add(1)
        mixedArrayList.add(true)
        mixedArrayList.add(1.41)
        println(mixedArrayList.get(4))
        println("////")

        println("----------------Set----------------")

        //Set
        val mySet = setOf<Int>(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9, 9)
        mySet.forEach {
            println(it)
        }
        println("////")

        val otherSet = HashSet<String>()
        otherSet.add("Seckin")
        otherSet.add("Seckin")
        otherSet.add("Seckin")
        otherSet.add("Guzel")
        otherSet.forEach {
            println(it)
        }
        println("////")

        println("----------------Map----------------")

        //Map
        val foodCaloriesMap = hashMapOf<String, Int>()
        foodCaloriesMap.put("Chicken", 100)
        foodCaloriesMap.put("Meat", 150)
        foodCaloriesMap.put("Bread", 250)
        foodCaloriesMap.forEach {
            println(it)
        }
        println("////")
        println(foodCaloriesMap.get("Chicken"))
        println("////")

        println("----------------When----------------")

        //When
        var examResultNumber = 3
        var examResultDescription = ""
        when (examResultNumber) {
            0 -> examResultDescription = "Worst"
            1 -> examResultDescription = "Weak"
            2 -> examResultDescription = "Bad"
            3 -> examResultDescription = "Middle"
            4 -> examResultDescription = "Good"
            5 -> examResultDescription = "Best"
            else -> examResultDescription = "Non graduation"
        }
        println(examResultDescription)
        println("////")

        println("----------------For----------------")

        //For
        val numbers = arrayOf(5, 10, 15, 20, 25, 30)
        for (number in numbers) {
            println(number)
        }
        println("////")

        println("----------------ClassWorkspace----------------")

        //ClassWorkspace
        val superman = SuperHero("Superman", 27)
        val batman = SuperHero("Batman", 32)
        println(superman.name + " " + superman.age)
        println(batman.name + " " + batman.age)
        println("////")
    }
}
