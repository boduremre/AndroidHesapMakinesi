package com.emrebodur.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var operator = "*"
    var eskiSayi = ""
    var yeniOperator = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnACClick(view: View) {
        editTextTextSayiGoster.setText("0")
    }

    fun btnOpTikClick(view: View) {
        var btnSec = view as Button

        when(btnSec.id){
            btnToplama.id->{
                operator="+"
            }

            btnCikarma.id->{
                operator="-"
            }

            btnBolme.id->{
                operator="/"
            }

            btnCarpma.id->{
                operator="x"
            }
        }
    }

    fun btnSayiTik(view: View) {
        var btnSec = view as Button
        var btnTikDeger: String = editTextTextSayiGoster.text.toString()

        when (btnSec.id) {
            btnSifir.id -> {
                btnTikDeger += "0"
            }

            btnBir.id -> {
                btnTikDeger += "1"
            }

            btnIki.id -> {
                btnTikDeger += "2"
            }

            btnUc.id -> {
                btnTikDeger += "3"
            }

            btnDort.id -> {
                btnTikDeger += "4"
            }

            btnBes.id -> {
                btnTikDeger += "5"
            }

            btnAlti.id -> {
                btnTikDeger += "6"
            }

            btnYedi.id -> {
                btnTikDeger += "7"
            }

            btnSekiz.id -> {
                btnTikDeger += "8"
            }

            btnDokuz.id -> {
                btnTikDeger += "9"
            }

            btnArtiEksi.id -> {
                btnTikDeger = "-" + btnTikDeger
            }
        }

        editTextTextSayiGoster.setText(btnTikDeger)
    }
}
