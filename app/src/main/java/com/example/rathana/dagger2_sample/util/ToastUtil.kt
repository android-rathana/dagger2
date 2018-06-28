package com.example.rathana.dagger2_sample.util

import android.content.Context
import android.widget.Toast

class ToastUtil(var context: Context) {
    fun showMessage(smg:String){
        Toast.makeText(context,smg,Toast.LENGTH_SHORT).show()
    }

}