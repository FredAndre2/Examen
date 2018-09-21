package com.holamundo.examen;

import java.util.ArrayList;

public class Metodos {
    private ArrayList<Celular> celulares;
    private static ArrayList<Celular> celulares_datos = new ArrayList();

    private static void guardar_c(Celular c){
        celulares_datos.add(c);
    }

    private static ArrayList<Celular> obtener_c(){
        return celulares_datos;
    }
    public double precio_promedio_nokia(){
        double promedio=0;
        double suma=0;
        double numero_celulares=0;
        celulares = Datos.obtener();


        for (int i = 0; i < celulares.size(); i++) {

            if(celulares.get(i).getMarca().equalsIgnoreCase("Nokia")){
                suma= suma + celulares.get(i).getPrecio();
                numero_celulares= numero_celulares +1;
            }
        }
        if(numero_celulares==0){
            return 0;
        }

      promedio = suma/numero_celulares;
        return promedio;
    }
    public int cant_celulares_apple(){
        int numero=0;

        celulares = Datos.obtener();


        for (int i = 0; i < celulares.size(); i++) {

            if(celulares.get(i).getMarca().equalsIgnoreCase("Apple")){
              if(celulares.get(i).getColor().equalsIgnoreCase("Negro")){
                  numero = numero + 1;
              }
            }
        }

        return numero;
    }
    public ArrayList<Celular> obtener_datos(){
        ArrayList<Celular> celulares_datos = new ArrayList<>();

        celulares = Datos.obtener();

        for (int i = 0; i < celulares.size(); i++) {

            if(celulares.get(i).getMarca().equalsIgnoreCase("Samsung")){
                if(celulares.get(i).getColor().equalsIgnoreCase("Negro")){
                    if(celulares.get(i).getSistemao().equalsIgnoreCase("Android")){
                        Celular c = new Celular(celulares.get(i).getDescripcion(),celulares.get(i).getModelo(),celulares.get(i).getColor(),celulares.get(i).getPrecio(),celulares.get(i).getMemoria(),celulares.get(i).getMarca(),celulares.get(i).getSistemao());
                        guardar_c(c);
                    }
                }
            }
        }
        celulares_datos = obtener_c();
        return celulares_datos;
    }
}
