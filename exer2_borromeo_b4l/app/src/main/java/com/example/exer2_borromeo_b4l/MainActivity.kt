package com.example.exer2_borromeo_b4l

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var displayImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayImage = findViewById(R.id.shown_img);
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
    }
}
