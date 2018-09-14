package com.holamundo.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class CantidadAppleNegro extends AppCompatActivity {
    private EditText txtcantidad;
    Metodos metodos = new Metodos();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cantidad_apple_negro);
        txtcantidad = findViewById(R.id.Txt_Cantidad_Apples);

        txtcantidad.setText(""+metodos.cant_celulares_apple());
    }
}
