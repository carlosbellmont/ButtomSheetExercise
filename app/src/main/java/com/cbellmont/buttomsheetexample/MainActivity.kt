package com.cbellmont.buttomsheetexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {
    private lateinit var buttomSheetRegistration: BottomSheetBehavior<ConstraintLayout>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        configureButtonSheet()

    }

    private fun configureButtonSheet(){
        buttomSheetRegistration = BottomSheetBehavior.from(findViewById(R.id.constraintRegistration))

        findViewById<LinearLayout>(R.id.layout_bar).post {
            buttomSheetRegistration.peekHeight = findViewById<LinearLayout>(R.id.layout_bar).height
        }
        buttomSheetRegistration.state = BottomSheetBehavior.STATE_COLLAPSED

        findViewById<LinearLayout>(R.id.layout_bar).setOnClickListener {
            if (buttomSheetRegistration.state == BottomSheetBehavior.STATE_EXPANDED) {
                buttomSheetRegistration.state = BottomSheetBehavior.STATE_COLLAPSED
            } else {
                buttomSheetRegistration.state = BottomSheetBehavior.STATE_EXPANDED
            }
        }
    }
}