/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.Serializable;

/**
 *
 * @author dg551
 */
public class Producto implements Serializable{
    private static int contadorCodigo = 0;
    String nombre;
    Double precio;
    String codigo;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = generarCodigoUnico();
    }
    
    // Método privado para generar un código único autoincrementable
    private String generarCodigoUnico() {
        contadorCodigo++;
        return "PROD_" + contadorCodigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    public String getCodigo() {
        return this.codigo;
    }
    
    
}
