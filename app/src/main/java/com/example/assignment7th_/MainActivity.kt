package com.example.assignment7th_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignment7th_.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    override fun onStart() {
        super.onStart()

        binding.btnAddTask.setOnClickListener {
            val addTaskFragment = AddTaskFragment()
            addTaskFragment.show(supportFragmentManager,addTaskFragment.tag)
        }




    }

    fun setTaskName(str:String){
        binding.taskDetail.text=str
    }
    fun setTaskDescription(str:String){
        binding.taskDescriptionDetail.text=str
    }

}