package com.holamundo.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class PrecioPromedio extends AppCompatActivity {
    private EditText txtpromedio;
    Metodos metodos = new Metodos();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precio_promedio);
        txtpromedio = findViewById(R.id.Txt_Resultado_Promedio);

        txtpromedio.setText(""+metodos.precio_promedio_nokia());
    }
}
