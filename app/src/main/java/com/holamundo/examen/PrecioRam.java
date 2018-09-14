package com.holamundo.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class PrecioRam extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Celular> celulares;
    Metodos metodos = new Metodos();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precio_ram);
        tabla = findViewById(R.id.tabla);
        celulares.clear();
        celulares = metodos.obtener_datos();

        for (int i = 0; i < celulares.size(); i++) {
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);


            c1.setText(""+String.format("%.2f", celulares.get(i).getPrecio()));
            c2.setText(celulares.get(i).getMemoria());


            fila.addView(c1);
            fila.addView(c2);


            tabla.addView(fila);
        }
    }
}
