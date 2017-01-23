package com.example.apoyo03_ui.antidoppingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
}
