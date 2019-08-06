package com.myapplicationdev.android.demogetmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetAge.setOnClickListener {
           val userDOB = etDOB.text.toString()
            if ( userDOB.isNotEmpty()) {
                val year = Calendar.getInstance().get(Calendar.YEAR)
                val age = year - userDOB.toInt()

                var output = ""

          /*      if (age < 18){
                    output = "Underage"
                } else if ( age in 18 .. 65){
                    output = "Young People"
                }else if ( age in 66 .. 79){
                    output = "Middle-Aged"
                }else if ( age in 80 .. 99){
                    output = "Elderly"
                }else{
                    output = "Long-Lived Elderly"
                }
          */
                when (age) {
                    in 0 .. 17 -> output = "Underage"
                    in 18 .. 65 -> output = "Young People"
                    in 66 .. 79 -> output = "Middle-Aged"
                    in 80 .. 99 -> output = "Elderly"
                    else -> {
                        output = " Long-Lived Elderly"
                    }
                }



                tvShowAge.text = "Your Age is $age \n $output"

            }else{
                Toast.makeText(this,"Please Enter Your Birth Year",Toast.LENGTH_SHORT).show()
            }

        }
    }
}
