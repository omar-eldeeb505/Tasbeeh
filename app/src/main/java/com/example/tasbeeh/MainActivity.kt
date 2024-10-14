package com.example.tasbeeh

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tasbeeh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var counter =0
    var azker=mutableListOf("سبحان الله","الحمد لله","لا اله الا الله","الله اكبر ")
    var index=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.sebBody.setOnClickListener {
            val x = (10.91f)
            binding.sebBody.rotation += x

            if (counter <=33)
            {
                binding.tasbehCount.text = counter.toString()
                binding.zikr.text = azker[index]
                counter++
            }else{

                counter=0
                index++

            }


        }
    }}
