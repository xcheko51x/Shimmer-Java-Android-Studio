package com.xcheko51x.shimmerjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout llContenedor;
    LinearLayout llCargando;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llContenedor = findViewById(R.id.llContenedor);
        llCargando = findViewById(R.id.llCargando);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                llCargando.setVisibility(View.GONE);
                llContenedor.setVisibility(View.VISIBLE);
            }
        }, 5000);
    }
}