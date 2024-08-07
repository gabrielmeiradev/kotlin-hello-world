package com.example.primeiraaulakotlin

import android.app.Activity
import android.os.Bundle
import android.view.View.TEXT_ALIGNMENT_CENTER
import android.widget.TextView
import androidx.core.view.setPadding

class HelloWorld: Activity() {
    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle);

        val textView = TextView(this);

        textView.text = "Hello World";
        textView.textAlignment = TEXT_ALIGNMENT_CENTER;
        textView.textSize = 50.0F;
        textView.setPadding(50);

        setContentView(textView);
    }
}