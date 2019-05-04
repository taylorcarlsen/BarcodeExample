package com.example.barcodeexample

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.second_screen.*
import android.content.Context
import android.widget.Toast

private var getTheNewString = "Default"

class AddItem : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_screen)

        /*val bundle : Bundle? = intent.extras

        bundle?.let {
            bundle.apply {
                val myItem: MyItem? = getParcelable("myitem")
                if(myItem != null){
                    tvItem.text = myItem?.myitem
                }
            }
        }*/

        getTheNewString = intent.getStringExtra("myitem")
        tvItem.setText(getTheNewString)

    }

}
