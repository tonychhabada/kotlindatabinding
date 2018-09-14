package com.databindingdemo

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var activityMainBinding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        var student = Student("Student 1", "Last Name");
        activityMainBinding.data = student
    }
}
