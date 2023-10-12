/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author dg551
 */
public class GestorVehiculos {
    public static GestorVehiculos instancia;
    private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    GestorPedidos gestorPedidos = GestorPedidos.getInstancia();
    
    public GestorVehiculos(){
        vehiculos.add(new Vehiculo("Vehiculo 1"));
        vehiculos.add(new Vehiculo("Vehiculo 2"));
        vehiculos.add(new Vehiculo("Vehiculo 3"));
    }
    
    public static GestorVehiculos getInstancia(){
        if(instancia == null){
            instancia = new GestorVehiculos();
        }
        return instancia;
    }
    
    public Vehiculo getVehiculoByCodigo(String codigo){
        for (Vehiculo vehiculo: vehiculos){
            if(vehiculo != null && vehiculo.getCodigo().equals(codigo)){
                return vehiculo;
            }
        }
        
        return null;
    }
    
    public ArrayList<Vehiculo> getVehiculos(){
        return vehiculos;
    }
    
    public ArrayList<Vehiculo> getVehiculosDisponibles() {
        ArrayList<Vehiculo> vehiculosDisponibles = new ArrayList<>();
        
        // Iterar a través de la lista de vehículos y verificar si tienen pedidos pendientes
        for (Vehiculo vehiculo : vehiculos) {
            boolean tienePedidosPendientes = false;

            // Verificar si el vehículo tiene pedidos pendientes
            for (Pedido pedido : gestorPedidos.getPedidosPendientes()) {
                if (pedido.getVehiculo().equals(vehiculo)) {
                    tienePedidosPendientes = true;
                    break;
                }
            }

            // Si no tiene pedidos pendientes, agregarlo a la lista de vehículos disponibles
            if (!tienePedidosPendientes) {
                vehiculosDisponibles.add(vehiculo);
            }
        }

        return vehiculosDisponibles;
    }
    
    
}
