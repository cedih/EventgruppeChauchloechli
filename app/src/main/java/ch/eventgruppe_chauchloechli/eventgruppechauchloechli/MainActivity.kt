package ch.eventgruppe_chauchloechli.eventgruppechauchloechli

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        login_button.setOnClickListener(){
            val username = editText5.text.toString()
            val passwort = editText4.text.toString()

            //at the moment no database available so:
            if(username.equals("Cedric")  && passwort.equals("asdfghjk")){
                setContentView(R.layout.activity_start)
            } else {


            }


        }

    }
}
