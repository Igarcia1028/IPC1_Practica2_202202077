package clases;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private ArrayList<Producto> productos;
    private Vehiculo vehiculo;
    private Double distancia;
    private Date fechaCreacion;
    private Date fechaEntrega;
    private boolean estado;

    public Pedido(ArrayList<Producto> productos, Vehiculo vehiculo, Double distancia) {
        this.productos = productos;
        this.vehiculo = vehiculo;
        this.distancia = distancia;
        this.estado = true;
        this.fechaCreacion = new Date();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public Double getDistancia() {
        return distancia;
    }
    
    public boolean getEstado() {
        return this.estado;
    }
    
    public void setEstado(boolean estado){
        this.estado = estado;
    }

    public Date getFechaSalida() {
        return fechaCreacion;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaCreacion = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaEntrega;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaEntrega = fechaLlegada;
    }
    
    
}
