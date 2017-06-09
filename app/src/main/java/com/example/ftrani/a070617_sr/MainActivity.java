package com.example.ftrani.a070617_sr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //probamos el debug
        //mostrarCalculo();

        btnMostrar = (Button) findViewById(R.id.btnMostrar);

        //metodo para gestion de evento clic del boton
        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarActividad();
            }
        });
    }

    //metodo de usuario para probar debug
    public void mostrarCalculo(){

        int a=5;
        int b=10;
        int c=20;
        int mayor;

        if(a>b){
            mayor=a;
        }else{
            mayor=b;
        }

        if(c>mayor){
            mayor=c;
        }

        Toast.makeText(this,"El mayor es: "+mayor, Toast.LENGTH_SHORT ).show();
    }

    private void mostrarActividad(){

        //intent explicito
        Intent intent = new Intent(this, SegundaActivity.class);

        //paso parametros en intent
        intent.putExtra("KEY_NOMBRE","Jose Perez");
        intent.putExtra("KEY_EMAIL","jperez@correo.com");

        //llamado a activity
        startActivity(intent);
    }
}
