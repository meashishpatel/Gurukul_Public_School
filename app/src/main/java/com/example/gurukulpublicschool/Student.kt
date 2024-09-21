package com.example.gurukulpublicschool

import android.text.Editable
import java.net.Inet4Address

class Student{
    var PhoneNumber = ""
    var studentName= ""
    var fatherName = ""
    var address = ""

    constructor(p_number: Editable, name: Editable, f_name: Editable, address: Editable){
        this.PhoneNumber = p_number.toString()
        this.studentName = name.toString()
        this.fatherName = f_name.toString()
        this.address = address.toString()
    }
}