/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author LENOVO
 */
public class Kamera {
    String merk;
    int pixel;
    int harga;
    
    void dinyalakan() {
        System.out.println("Kamera " + merk + " dengan harga " + harga + " dinyalakan");
    }
    
    void dimatikan() {
        System.out.println("Kamera " + merk + " dimatikan");
    }
    
    void mengambilGambar() {
        System.out.println("Kamera " + merk + " merngambil gambar " + pixel + "MP");
    }
    
    void mengambilVideo() {
        System.out.println("Kamera " + merk + " merngambil video " + pixel + "MP");
    }
}
