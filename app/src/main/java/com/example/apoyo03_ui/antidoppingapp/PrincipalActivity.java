package com.example.apoyo03_ui.antidoppingapp;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void goBusqueda(View view){
        Intent intent = new Intent(getApplicationContext(),BusquedaActivity.class);
        startActivity(intent);
    }
    public void goProhibida(View view){
        Intent intent = new Intent(getApplicationContext(),ProhibidaActivity.class);
        startActivity(intent);
    }
    public void goVideo(View view){
        Intent intent = new Intent(getApplicationContext(),VideoActivity.class);
        startActivity(intent);
    }
    public void goSancionado(View view){
        Intent intent = new Intent(getApplicationContext(),SancionadoActivity.class);
        startActivity(intent);
    }
    public void goRiesgos(View view){
        Intent intent = new Intent(getApplicationContext(),RiesgosActivity.class);
        startActivity(intent);
    }
    public void goAUT(View view){
        Intent intent = new Intent(getApplicationContext(),TabActivity.class);
        startActivity(intent);
    }

    @SuppressLint("NewApi")
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // TODO Auto-generated method stub
        if (keyCode == event.KEYCODE_BACK) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("¿Desea salir de la app?")
                    .setTitle("Aviso")
                    .setCancelable(false)
                    .setNegativeButton("No",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            })
                    .setPositiveButton("Sí",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    finishAffinity();
                                }
                            });
            AlertDialog alert = builder.create();
            alert.show();
        }
        return super.onKeyDown(keyCode, event);
    }
}
