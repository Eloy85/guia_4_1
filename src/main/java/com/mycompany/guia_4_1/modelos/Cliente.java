package com.mycompany.guia_4_1.modelos;

public class Cliente {
    private int codigo;
    private String nombre;
    private String apellido;
    private int estado;

    public Cliente(int codigo, String nombre, String apellido, int estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
    }

    public Cliente() {
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEstado() {
        return estado;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", estado=" + estado + '}';
    }
    
    public boolean isActivo() {
        return estado == 0;
    }
}
