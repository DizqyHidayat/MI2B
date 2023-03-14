/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Kamera mirrorless = new Kamera();
        mirrorless.merk = "Canon";
        mirrorless.pixel = 50;
        mirrorless.harga = 15;
        mirrorless.dinyalakan();
        mirrorless.mengambilGambar();
        mirrorless.mengambilVideo();
        mirrorless.dimatikan();
    }
}
   
