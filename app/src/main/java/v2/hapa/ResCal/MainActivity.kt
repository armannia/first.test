package v2.hapa.ResCal

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val black = arrayOf("0",1,null,null)
        print (black[1])

        val ring4Page = findViewById<Button>(R.id.FourRing)
        ring4Page.setOnClickListener{
            val intent = Intent(this,Four_Ring::class.java)
            startActivity(intent)
        }

        val ring5Page = findViewById<Button>(R.id.FiveRIng)
        ring5Page.setOnClickListener{
            val intent = Intent(this,Five_Ring::class.java)
            startActivity(intent)
        }

        val ring6Page = findViewById<Button>(R.id.SixRIng)
        ring6Page.setOnClickListener{
            val intent = Intent(this,Six_Ring::class.java)
            startActivity(intent)
        }
    }
}