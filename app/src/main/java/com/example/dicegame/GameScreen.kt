package com.example.dicegame

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.dicegame.R.drawable.*
import kotlinx.android.synthetic.main.activity_game_screen.*
import java.util.*

class GameScreen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_screen)
        //val rolldices: ImageView = findViewById(R.id.iv_dice)
        //rolldices.setOnClickListener(rollDice())
    }

    //Counter Variables for each dice face
    var count1: Int = 0
    var count2: Int = 0
    var count3: Int = 0
    var count4: Int = 0
    var count5: Int = 0
    var count6: Int = 0
    fun rollDice(view: View) {
        //Creates Random variable to randomize each dice roll
        val r = Random().nextInt(6) + 1
        if (r == 1) {
            iv_dice.setImageResource(dice)
            count1++
            tv1.text = "1:$count1"
        }
        if (r == 2) {
            iv_dice.setImageResource(dice2)
            count2++
            tv2.text = "2:$count2"
        }
        if (r == 3) {
            iv_dice.setImageResource(dice3)
            count3++
            tv3.text = "3:$count3"
        }
        if (r == 4) {
            iv_dice.setImageResource(dice4)
            count4++
            tv4.text = "4:$count4"
        }
        if (r == 5) {
            iv_dice.setImageResource(dice5)
            count5++
            tv5.text = "5:$count5"
        }
        if (r == 6) {
            iv_dice.setImageResource(dice6)
            count6++
            tv6.text = "6:$count6"
        }
    }
    fun reset2zero(view: View) {
        if (view == resetbtn) {
            count1 = 0
            count2 = 0
            count3 = 0
            count4 = 0
            count5 = 0
            count6 = 0
            tv1.text = "1:$count1"
            tv2.text = "2:$count2"
            tv3.text = "3:$count3"
            tv4.text = "4:$count4"
            tv5.text = "5:$count5"
            tv6.text = "6:$count6"
        }
    }
}

/*
val images: Int = when () {
    1 -> {
        dice
        count++
    }

    2 -> {
        dice2
        count2++
    }

    3 -> {
        dice3
        count3++
    }

    4 -> {
        dice4
        count4++
    }

    5 -> {
        dice5
        count5++
    }
    else -> {
        dice6
        count6++
    }
}
iv_dice.setImageResource(images)
*/
/*val rand = Random()
val dices = arrayOf(
R.drawable.dice,R.drawable.dice2,
R.drawable.dice3,R.drawable.dice4,
R.drawable.dice5,R.drawable.dice6
)
val index = rand.nextInt(dices.size)
lv.setOnItemClickListener { list, item, index, id ->
if (index == 0) {
    Toast.makeText(this, "1", Toast.LENGTH_SHORT).show()
    iv.setImageResource(R.drawable.dice)
} else if (index == 1) {
    Toast.makeText(this, "2", Toast.LENGTH_SHORT).show()
    iv.setImageResource(R.drawable.dice2)
} else if (index == 2) {
    Toast.makeText(this, "3", Toast.LENGTH_SHORT).show()
    iv.setImageResource(R.drawable.dice3)
} else if (index == 3) {
    Toast.makeText(this, "4", Toast.LENGTH_SHORT).show()
    iv.setImageResource(R.drawable.dice4)
}
}val tV1:TextView=findViewById(R.id.tv1)
        val t:TextView=findViewById(R.id.tv2)
        val tV3:TextView=findViewById(R.id.tv3)
        val tV4:TextView=findViewById(R.id.tv4)
        val tV5:TextView=findViewById(R.id.tv5)
        val tV6:TextView=findViewById(R.id.tv6)
        */
