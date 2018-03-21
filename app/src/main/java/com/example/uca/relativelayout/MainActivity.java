package com.example.uca.relativelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

private TextView textcont;
private TextView textcont2;
private int puntos, puntosb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textcont = findViewById(R.id.cont1);
        textcont2 = findViewById(R.id.cont2);
        puntos=0;
        puntosb=0;



    }

    public void uno(View v) {
        Log.d("mensaje", "un punto a ");
        puntos++;
        textcont.setText(puntos+ "");

    }
    public void dos(View v) {
        Log.d("mensaje", "dos puntos a");
        puntos = puntos +2;
        textcont.setText(puntos + "");
    }
    public void tres(View v) {
        Log.d("mensaje", "tres puntos a");
        puntos = puntos+3;
        textcont.setText(puntos + "");
    }

    public void unob(View v) {
        Log.d("mensaje", "un punto b ");
        puntosb ++;
        textcont2.setText(puntosb + "");

    }
    public void dosb(View v) {
        Log.d("mensaje", "dos puntos b");
        puntosb = puntosb+2;
        textcont2.setText(puntosb + "");
    }
    public void tresb(View v) {
        Log.d("mensaje", "tres puntos b");
        puntosb = puntosb+3;
        textcont2.setText(puntosb + "");
    }

    public void reset(View v) {
        Log.d("mensaje", "tres puntos b");
        puntos=0;
        puntosb=0;
        textcont2.setText("0");
        textcont.setText("0");
    }
}
