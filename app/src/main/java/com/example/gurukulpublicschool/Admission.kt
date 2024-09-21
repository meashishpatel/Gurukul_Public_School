package com.example.gurukulpublicschool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class Admission : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admission)

        var database = FirebaseDatabase.getInstance().reference

        val submit: Button = findViewById(R.id.submit)
        val studentname = findViewById<EditText>(R.id.student_name)
        val fathername = findViewById<EditText>(R.id.father_name)
        val phone_number: EditText = findViewById(R.id.phone_number)
        val add = findViewById<EditText>(R.id.address)

        var name = studentname.text
        var fname = fathername.text
        var pnumber = phone_number.text
        var address = add.text

        submit.setOnClickListener{
            database.child(pnumber.toString()).setValue(Student(pnumber, name, fname, address))
            Toast.makeText(this, "Submitted", Toast.LENGTH_SHORT).show()
        }
    }
}