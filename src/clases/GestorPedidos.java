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
public class GestorPedidos {
    private static GestorPedidos instancia;
    ArrayList<Pedido> pedidos = new  ArrayList<Pedido>();  
    
    
    public GestorPedidos(){
    
    }
    
    public static GestorPedidos getInstancia(){
        if(instancia == null){
            instancia = new GestorPedidos();
        }
        
        return instancia;
    }
    
    public ArrayList<Pedido> getPedidosPendientes() {
        ArrayList<Pedido> pedidosPendientes = new ArrayList<Pedido>();
        
        for (Pedido pedido: pedidos) {
            if(pedido != null && pedido.getEstado()){
                pedidosPendientes.add(pedido);
            }
        }
        return pedidosPendientes;
    }
    
    public void agregarPedido(ArrayList<Producto> productos, Vehiculo vehiculo, Double distancia) {
        try{
            pedidos.add(new Pedido(productos, vehiculo, distancia));
        }catch (Exception e){
        }
    }
}
