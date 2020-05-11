package com.example.stackapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.stackapp.fragments.AboutFragment
import com.example.stackapp.fragments.QuestionsFragment
import com.example.stackapp.fragments.SettingsFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun menuClick(view: View) {
        when (view.id){
            R.id.btnMenuQuestions -> QuestionsFragment().load()
            R.id.btnMenuSettings -> SettingsFragment().load()
            R.id.btnMenuAbout -> AboutFragment().load()
        }
    }

    private fun Fragment.load() = supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameLayout, this)
            .commit()

}
