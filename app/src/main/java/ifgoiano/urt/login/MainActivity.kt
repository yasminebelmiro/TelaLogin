package ifgoiano.urt.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun onSendMessage(view: View) {
        val emailText = findViewById<TextView>(R.id.emailText)
        val senhaText = findViewById<TextView>(R.id.senhaText)
        val login = emailText.text.toString()
        val senha = senhaText.text.toString()

        if (login.equals("Yasmine@gmail.com") && senha.equals("12345678")){
           val intent = Intent(this, PaginaPrincipal::class.java)
            startActivity(intent)
        }else{
            Toast.makeText(this, "Login ou senha incorretos", Toast.LENGTH_SHORT).show()
        }
    }
}