package mx.edu.potros.practica5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button = findViewById(R.id.btnGetStarted)

        button.setOnClickListener {
            var intent:Intent=Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}