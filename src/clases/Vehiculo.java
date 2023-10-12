package clases;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author dg551
 */
public class Vehiculo extends Thread{
    private String nombre;
    private int distanciaRecorrida; // Distancia en km
    private Double distanciaARecorrer;
    private JPanel panel;
    private JLabel img;
    private static int contadorCodigo = 0;
    String codigo;
    ImageIcon imagenIconIda = new ImageIcon("D:\\USAC\\4to. SEMESTRE\\IPC1\\LABORATORIO IPC1\\GestionDelivery\\src\\vistas\\img\\vehiculoIda.png");
    ImageIcon imagenIconVuelta = new ImageIcon("D:\\USAC\\4to. SEMESTRE\\IPC1\\LABORATORIO IPC1\\GestionDelivery\\src\\vistas\\img\\vehiculoVuelta.png");
    Image imagenIda = imagenIconIda.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
    Image imagenVuelta = imagenIconVuelta.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
    ImageIcon iconoEscaladoIda = new ImageIcon(imagenIda);
    ImageIcon iconoEscaladoVuelta = new ImageIcon(imagenVuelta);
    
    
    public Vehiculo(String nombre) {
        this.nombre = nombre;
        this.distanciaRecorrida = 0;
        this.codigo = generarCodigoUnico();
    }
    
    // Método privado para generar un código único autoincrementable
    private String generarCodigoUnico() {
        contadorCodigo++;
        return "M_" + contadorCodigo;
    }
    
    public String getCodigo() {
        return this.codigo;
    }
    
     public String getNombre() {
        return nombre;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }
    
    public void actualizarPosicion(int distancia) {
        distanciaRecorrida += distancia;
    }
    
    public void setDistancia (Double distancia){
        if (distancia > 10.0){
            distanciaARecorrer = 10.0;
        } else {
            distanciaARecorrer = distancia;
        }
    }
    
    public void setElementos (JLabel img, JPanel panel){
        this.img = img;
        this.panel = panel;
    }

    @Override
    public void run() {
        int ancho = panel.getWidth() - 50;
        int velocidad = (int)((distanciaARecorrer*2) / 0.8);
        try {
            for (int i = 0; i < ancho; i++) {
                actualizarPosicion(1);
                this.img.setBounds(distanciaRecorrida, img.getY(), 50, 50);
                this.img.setIcon(iconoEscaladoIda);
                Thread.sleep(velocidad);
            }

            for (int i = ancho; i >= 0; i--) {
                actualizarPosicion(-1);
                this.img.setBounds(distanciaRecorrida, img.getY(), 50, 50);
                this.img.setIcon(iconoEscaladoVuelta);
                Thread.sleep(velocidad);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

