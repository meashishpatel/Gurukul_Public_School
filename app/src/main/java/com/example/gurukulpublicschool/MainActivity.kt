package com.example.gurukulpublicschool


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfigSettings

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // register all the ImageButtons with their appropriate IDs
//        val backB: ImageButton = findViewById(R.id.backB)
//        val logOutB: ImageButton = findViewById(R.id.logOutB)
//        val profileB: ImageButton = findViewById(R.id.profileB)

        // register all the Buttons with their appropriate IDs
        val todoB: Button = findViewById(R.id.todoB)
        val editProfileB: Button = findViewById(R.id.editProfileB)

        // register all the card views with their appropriate IDs
        val contributeCard: CardView = findViewById(R.id.contributeCard)
        val practiceCard: CardView = findViewById(R.id.practiceCard)
        val learnCard: CardView = findViewById(R.id.learnCard)
        val interestsCard: CardView = findViewById(R.id.interestsCard)
        val helpCard: CardView = findViewById(R.id.helpCard)
        val settingsCard: CardView = findViewById(R.id.settingsCard)


        // handle each of the image buttons with the OnClickListener
//        backB.setOnClickListener {
//            Toast.makeText(this, "Back Button", Toast.LENGTH_SHORT).show()
//        }
//        logOutB.setOnClickListener {
//            Toast.makeText(this, "Logout Button", Toast.LENGTH_SHORT).show()
//        }
//        profileB.setOnClickListener {
//            Toast.makeText(this, "Profile Image", Toast.LENGTH_SHORT).show()
//        }


        // handle each of the buttons with the OnClickListener
        todoB.setOnClickListener {
                val call = Intent(Intent.ACTION_DIAL)
                call.data = Uri.parse("tel:+919308833874")
                startActivity(call)
        }
        editProfileB.setOnClickListener {
            val i = Intent(applicationContext, MapsActivity::class.java)
            startActivity(i)
        }


        // handle each of the cards with the OnClickListener
        contributeCard.setOnClickListener {
            Toast.makeText(this, "Make sure you've Internet Connection to complete form", Toast.LENGTH_SHORT).show()
            val remoteConfig: FirebaseRemoteConfig = Firebase.remoteConfig
            val configSettings = remoteConfigSettings {
                minimumFetchIntervalInSeconds = 60
            }
            remoteConfig.setConfigSettingsAsync(configSettings)
            remoteConfig.setDefaultsAsync(R.xml.remote_config_defaults)

            remoteConfig.fetchAndActivate()
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        val announcement = remoteConfig.getString("announcement_text")
                        val announcementTv = findViewById<TextView>(R.id.announcement_body)
                        announcementTv.text = announcement

                    }
                }
            val i = Intent(applicationContext, Admission::class.java)
            startActivity(i)

        }
        practiceCard.setOnClickListener {
            val i = Intent(applicationContext, PaymentActivity::class.java)
            startActivity(i)
        }
        learnCard.setOnClickListener {
            val i = Intent(applicationContext, Gallery::class.java)
            startActivity(i)
        }
        interestsCard.setOnClickListener {
            val i = Intent(applicationContext, announcement::class.java)
            startActivity(i)

        }
        helpCard.setOnClickListener {
            val i = Intent(applicationContext, HelpActivity::class.java)
            startActivity(i)
        }
        settingsCard.setOnClickListener{
            val i = Intent(applicationContext, AboutUs::class.java)
            startActivity(i)
        }


    }
}