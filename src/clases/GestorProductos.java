package clases;

import archivos.Binario;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author dg551
 */
public class GestorProductos implements Serializable{
    public static GestorProductos instancia;
    private ArrayList<Producto> productos = new ArrayList<>();
    
    public GestorProductos(){

    }
    
    public static GestorProductos getInstancia() {
        if(instancia == null) {
            instancia = new GestorProductos();
        }
        return instancia;
    }
    
    public void crearProducto(String nombre, Double precio){
        try {
            productos.add(new Producto(nombre, precio));
        } catch (Exception e){
        }
    }
    
    public Producto getProductoByCodigo(String codigo){
        for (Producto producto : productos) {
            if (producto != null && producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }
    
    public void eliminarProducto(String codigo) {
        Producto producto = getProductoByCodigo(codigo);
        if (producto != null) {
            productos.remove(producto);
        }
    }
    
    public void actualizarProducto(String codigo, String nombre, Double precio) {
        try{
            Producto profesor = getProductoByCodigo(codigo);
            if (profesor != null) {
                profesor.setNombre(nombre);
                profesor.setPrecio(precio);
            } else {
        }
        }catch (Exception e){
        }
    }
    
    public ArrayList<Producto> getProductos(){
        return this.productos;
    }
    
    public void setListaProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
}
