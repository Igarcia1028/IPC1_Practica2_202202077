package archivos;

import clases.Producto;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author dg551
 */
public class Binario {
    String fileNameProfesor;
    
    public Binario() {
        this.fileNameProfesor = "D:\\USAC\\4to. SEMESTRE\\IPC1\\LABORATORIO IPC1\\GestionDelivery\\files\\Productos.bin";
    }
    
    public boolean guardarProductos(ArrayList<Producto> lstProductos){
        try {
            FileOutputStream fos = new FileOutputStream(fileNameProfesor);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(lstProductos);
            oos.close();
            return true;
        } catch (Exception e){
            return false;
        }
    }
    
    public ArrayList<Producto> obtenerProductos(){
        ArrayList<Producto> usuarios = new ArrayList<Producto>();
        try {
            File f = new File(fileNameProfesor);
            if(f.exists()){
                FileInputStream fis = new FileInputStream(fileNameProfesor);
                ObjectInputStream ois = new ObjectInputStream(fis);
                usuarios = (ArrayList<Producto>) ois.readObject();
                ois.close();
            }
            return usuarios;
        } catch (Exception e){
            return usuarios;
        }
    }
}
