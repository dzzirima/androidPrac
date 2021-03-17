package com.example.fragmentsprac.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fragmentsprac.R
import com.example.fragmentsprac.ui.fragments.FirstFragment
import com.example.fragmentsprac.ui.fragments.SecondFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply{
            changeFragment(firstFragment)
        }
        btnFragment1.setOnClickListener {
           changeFragment(firstFragment)
        }
        btnFragment2.setOnClickListener {
            changeFragment(secondFragment);
            }
        }
        // function to change the fragmrnts
        private fun changeFragment(fragment : Fragment){
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frmLayout,fragment)
                // so that we aplay the changes
                commit()

            }

        }
    }
