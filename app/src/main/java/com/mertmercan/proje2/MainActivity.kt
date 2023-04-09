package com.mertmercan.proje2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mertmercan.proje2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var number1: Int? = null

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }
    fun button(view : View){

        val number1 = binding.number1.text.toString().toIntOrNull()

        if (number1 == null){
            binding.textView1.text = "Error"
        }else if (number1 != null){
            if (number1%2==0){
                  binding.textView1.text = "${number1} sayısı çift sayıdır ."
            }else{
                binding.textView1.text = "${number1} sayısı tek sayıdır ."
            }
        }
    }
}