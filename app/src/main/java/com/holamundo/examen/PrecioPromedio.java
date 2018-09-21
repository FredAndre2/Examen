package com.holamundo.examen;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class PrecioPromedio extends AppCompatActivity {
    private EditText txtpromedio;
    Metodos metodos = new Metodos();
    private AlertDialog.Builder mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precio_promedio);
        mensaje= new AlertDialog.Builder(this);
        txtpromedio = findViewById(R.id.Txt_Resultado_Promedio);
        if(metodos.precio_promedio_nokia()==0){
            mensaje.setMessage(getResources().getString(R.string.Error3)).show();
        }
        else{
            txtpromedio.setText(""+metodos.precio_promedio_nokia());
        }

    }
}
