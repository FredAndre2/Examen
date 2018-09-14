package com.holamundo.examen;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Registrar extends AppCompatActivity {
    private EditText txtdescripcion,txtmodelo,txtcolor,txtprecio,txtmemoria,txtmarca,txtsistemao;
    private Resources recursos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        txtdescripcion = findViewById(R.id.Txt_Descripcion);
        txtmodelo = findViewById(R.id.Txt_Modelo);
        txtcolor = findViewById(R.id.Txt_Color);
        txtprecio = findViewById(R.id.Txt_Precio);
        txtmemoria = findViewById(R.id.Txt_Memoria);
        txtmarca = findViewById(R.id.Txt_Marca);
        txtsistemao = findViewById(R.id.Txt_SO);
        recursos = this.getResources();
    }
    public boolean Validar(){
        if (txtdescripcion.getText().toString().isEmpty()){
            txtdescripcion.requestFocus();
            txtdescripcion.setError(recursos.getString(R.string.Error2));
            return false;
        }
        if (txtmodelo.getText().toString().isEmpty()){
            txtmodelo.requestFocus();
            txtmodelo.setError(recursos.getString(R.string.Error2));
            return false;
        }
        if (txtcolor.getText().toString().isEmpty()){
            txtcolor.requestFocus();
            txtcolor.setError(recursos.getString(R.string.Error2));
            return false;
        }
        if (txtprecio.getText().toString().isEmpty()){
            txtprecio.requestFocus();
            txtprecio.setError(recursos.getString(R.string.Error2));
            return false;
        }
        if (Integer.parseInt(txtprecio.getText().toString())==0){
            txtprecio.requestFocus();
            txtprecio.setError(recursos.getString(R.string.Error1));
            return false;
        }
        if (txtmemoria.getText().toString().isEmpty()){
            txtmemoria.requestFocus();
            txtmemoria.setError(recursos.getString(R.string.Error2));
            return false;
        }
        if (txtmarca.getText().toString().isEmpty()){
            txtmarca.requestFocus();
            txtmarca.setError(recursos.getString(R.string.Error2));
            return false;
        }
        if (txtsistemao.getText().toString().isEmpty()){
            txtsistemao.requestFocus();
            txtsistemao.setError(recursos.getString(R.string.Error2));
            return false;
        }
        return true;
    }
    public void guardar(View v){
        if (Validar()){
            String descripcion,modelo,color,memoria,marca,sistemao;
            double precio;


            descripcion = txtdescripcion.getText().toString();
            modelo = txtmodelo.getText().toString();
            color = txtcolor.getText().toString();
            memoria = txtmemoria.getText().toString();
            marca = txtmarca.getText().toString();
            sistemao = txtsistemao.getText().toString();
            precio = Double.parseDouble(txtprecio.getText().toString());

            Celular o = new Celular(descripcion,modelo,color,precio,memoria,marca,sistemao);
            o.guardar();
            borrar();
        }
    }

    public void limpiar(View v){
        borrar();
    }

    private void borrar(){
        txtdescripcion.setText("");
        txtmodelo.setText("");
        txtcolor.setText("");
        txtprecio.setText("");
        txtmemoria.setText("");
        txtmarca.setText("");
        txtsistemao.setText("");
    }
}

