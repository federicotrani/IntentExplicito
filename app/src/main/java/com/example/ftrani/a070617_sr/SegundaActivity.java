package com.example.ftrani.a070617_sr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private String nombre;
    private String email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        //recupero parametros
        Bundle parametros = getIntent().getExtras();

        nombre = parametros.getString("KEY_NOMBRE");
        email = parametros.getString("KEY_EMAIL");

        //referencia controles de UI
        TextView txtEmail = (TextView) findViewById(R.id.txtEmail);
        TextView txtNombre = (TextView) findViewById(R.id.txtNombre);

        //asignacion parametros recuperados a UI
        txtEmail.setText(email);
        txtNombre.setText(nombre);


    }
}
