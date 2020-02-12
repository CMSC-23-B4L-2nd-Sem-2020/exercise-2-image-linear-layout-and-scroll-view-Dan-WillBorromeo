package com.example.exer2_borromeo_b4l

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var displayImage : ImageView
    lateinit var displayText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayImage = findViewById(R.id.shown_img);
        displayText = findViewById(R.id.shown_txt);
    }

    fun changeDisplay(view: View) {
        val randomInt = (1..10).random();

        val drawableResource = when (randomInt) {
            1 ->R.drawable.agent_p;
            2 ->R.drawable.candace;
            3 ->R.drawable.danny_fenton;
            4 ->R.drawable.doofenshmirtz;
            5 ->R.drawable.grim;
            6 ->R.drawable.kuzco;
            7 ->R.drawable.mr_krabs;
            8 ->R.drawable.patrick_star;
            9 ->R.drawable.sam_manson;
            else ->R.drawable.taylor_hebert;
        }

        displayImage.setImageResource(drawableResource)

        if (randomInt === 1) {
            displayText.text = getString(R.string.agent_p)
        } else if (randomInt === 2) {
            displayText.text = getString(R.string.candace)
        } else if (randomInt === 3) {
            displayText.text = getString(R.string.danny_fenton)
        } else if (randomInt === 4) {
            displayText.text = getString (R.string.doofenshmirtz)
        } else if (randomInt === 5) {
            displayText.text = getString(R.string.grim)
        } else if (randomInt === 6) {
            displayText.text = getString(R.string.kuzco)
        } else if (randomInt === 7) {
            displayText.text = getString(R.string.mr_krabs)
        } else if (randomInt === 8) {
            displayText.text = getString(R.string.patrick_star)
        } else if (randomInt === 9) {
            displayText.text = getString(R.string.sam_manson)
        } else {
            displayText.text = getString(R.string.taylor_hebert)
        }
    }

    fun resetDisplay(view: View) {
        displayImage.setImageResource(R.drawable.tv_logo)
        displayText.text = getString(R.string.header_text)
    }
}
