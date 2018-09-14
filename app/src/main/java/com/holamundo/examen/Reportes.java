package com.holamundo.examen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Reportes extends AppCompatActivity {
    private ListView lv;
    private String [] opc;
    private Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);
        lv = findViewById(R.id.List_Opciones_Reportes);
        opc = getResources().getStringArray(R.array.opciones_reportes);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, opc);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                switch (i){
                    case 0:
                        in = new Intent(Reportes.this, PrecioPromedio.class);
                        startActivity(in);
                        break;
                    case 1:
                        in = new Intent(Reportes.this, CantidadAppleNegro.class);
                        startActivity(in);
                        break;
                    case 2:
                        in = new Intent(Reportes.this, PrecioRam.class);
                        startActivity(in);
                        break;
                }
            }
        });
    }
}
