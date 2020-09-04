package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var foodList = arrayOf("Pizza", "Burger", "Kabab", "KFC", "MAC")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addFoodBtnPressed(view: View) {
        if (editTxt.text.toString() == "") {
            Toast.makeText(this, "Please enter your food!",
                Toast.LENGTH_SHORT).show();
        }
        txtView.text = editTxt.text.toString()
    }
    fun decideBtnPressed(view: View) {

            txtView.text = foodList.get((0..foodList.count()-1).random())

    }

}