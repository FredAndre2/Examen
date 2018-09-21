package com.holamundo.examen;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class CantidadAppleNegro extends AppCompatActivity {
    private EditText txtcantidad;
    Metodos metodos = new Metodos();
    private AlertDialog.Builder mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cantidad_apple_negro);
        txtcantidad = findViewById(R.id.Txt_Cantidad_Apples);
       mensaje = new AlertDialog.Builder(this);
        if(metodos.cant_celulares_apple()==0){
            mensaje.setMessage(getResources().getString(R.string.Error3)).show();
        }
        else{
            txtcantidad.setText(""+metodos.cant_celulares_apple());
        }

    }
}
