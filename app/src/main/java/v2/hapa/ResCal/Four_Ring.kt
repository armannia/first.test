package v2.hapa.ResCal

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.util.ArrayList

class Four_Ring : AppCompatActivity() {
    var v1 = 0 ; var v2 = 0; var v3 = 0.0 ; var v4 = 0.0 ;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four_ring)

        val options = arrayOf("schwarz","braun","rot","orange","gelb","grün","blau","violett","grau","weiß")
        val optionsSilver = arrayOf("silver","gold","braun","rot","gelb","grün","blau","violett","grau")
        val optionsOhneSchwarz = arrayOf("braun","rot","orange","gelb","grün","blau","violett","grau","weiß")
        val option1 = findViewById<Spinner>(R.id.spinner1)
        val option2 = findViewById<Spinner>(R.id.spinner2)
        val option3 = findViewById<Spinner>(R.id.spinner3)
        val option4 = findViewById<Spinner>(R.id.spinner4)
        var result1 = findViewById<TextView>(R.id.textView6)
        val result2 = findViewById<TextView>(R.id.textView62)
        val view1 = findViewById<TextView>(R.id.textView1)
        val view2 = findViewById<TextView>(R.id.textView2)
        val view3 = findViewById<TextView>(R.id.textView3)
        val view4 = findViewById<TextView>(R.id.textView4)

        option1.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,optionsOhneSchwarz)
        option2.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)
        option3.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,optionsSilver)
        option4.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,optionsSilver)

        option1.onItemSelectedListener = object  : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {
                return
            }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, id: Long) {
                val farbe = optionsOhneSchwarz[position]
                v1 = when (farbe) {
                    "braun" -> 1
                    "rot" -> 2
                    "orange" -> 3
                    "gelb" -> 4
                    "grün" -> 5
                    "blau" -> 6
                    "violett" -> 7
                    "grau" -> 8
                    "weiß"-> 9
                    else -> return }
                view1.text =  " " + v1
            }

        }

        option2.onItemSelectedListener = object  : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {
                return
            }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, id: Long) {
                val farbe = options[position]
                v2 = when (farbe) {
                    "schwarz" -> 0
                    "braun" -> 1
                    "rot" -> 2
                    "orange" -> 3
                    "gelb" -> 4
                    "grün" -> 5
                    "blau" -> 6
                    "violett" -> 7
                    "grau" -> 8
                    "weiß"-> 9
                    else -> return
                }
                view2.text = " " + v2
            }
        }
        option3.onItemSelectedListener = object  : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {
                return
            }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, id: Long) {
                val farbe = options[position]
                v3 = when (farbe) {
                    "silver" -> 0.01
                    "gold" -> 0.1
                    "schwarz" -> 1.0
                    "braun" -> 10.0
                    "rot" -> 100.0
                    "orange" -> 1000.0
                    "gelb" -> 10000.0
                    "grün" -> 100000.0
                    "blau" -> 1000000.0
                    "violett" -> 10000000.0
                    "grau" -> 100000000.0
                    "weiß" -> 1000000000.0
                    else -> return
                }
                view3.text = " " + v3
            }
        }
        option4.onItemSelectedListener = object  : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {
                return
            }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, id: Long) {
                val farbe = options[position]
                v4 = when (farbe) {
                    "silver" -> 10.0
                    "gold" -> 5.0
                    "braun" -> 1.0
                    "rot" -> 2.0
                    "gelb" -> 0.25
                    "grün" -> 0.5
                    "blau" -> 0.25
                    "violett" -> 0.1
                    "grau" -> 0.05
                    else -> return
                }
                view4.text = " " + v4
            }
        }
        val calc = findViewById<Button>(R.id.calc)
        calc.setOnClickListener{
            val res = ""+ (v1 *10 +v2 )*v3 + "Ω"
            result1.text = res
            result2.text = "+/-" + v4 + "%"
        }
    }
}