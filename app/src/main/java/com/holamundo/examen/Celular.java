package com.holamundo.examen;

public class Celular {
    private String descripcion;
    private String modelo;
    private String color;
    private double precio;
    private String memoria;
    private String marca;
    private String sistemao;

    public Celular(String descripcion, String modelo, String color, double precio, String memoria, String marca, String sistemao) {
        this.descripcion = descripcion;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.memoria = memoria;
        this.marca = marca;
        this.sistemao = sistemao;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemao() {
        return sistemao;
    }

    public void setSistemao(String sistemao) {
        this.sistemao = sistemao;
    }
    public void guardar(){
        Datos.guardar(this);
    }
}
