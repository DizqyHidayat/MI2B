/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    String nama,nobp,kelas,prodi,jurusan;
    
    public static void main(String[] args){
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Dayat";
        mhs.nobp = "2101092044";
        mhs.kelas = "MI2B";
        mhs.prodi = "MI";
        mhs.jurusan = "Teknologi Informasi";
        
        System.out.println("Mahasiswa 1");
        System.out.println("Nama    : " +mhs.nama);
        System.out.println("No Bp   : " +mhs.nobp);
        System.out.println("Kelas   : " +mhs.kelas);
        System.out.println("Prodi   : " +mhs.prodi);
        System.out.println("Jurusan : " +mhs.jurusan);
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "Ihsan";
        mhs2.nobp = "2101092048";
        mhs2.kelas = "MI2B";
        mhs2.prodi = "MI";
        mhs2.jurusan = "Teknologi Informasi";
        
        System.out.println("\n");
        System.out.println("Mahasiswa 2");
        System.out.println("Nama    : " +mhs2.nama);
        System.out.println("No Bp   : " +mhs2.nobp);
        System.out.println("Kelas   : " +mhs2.kelas);
        System.out.println("Prodi   : " +mhs2.prodi);
        System.out.println("Jurusan : " +mhs2.jurusan);
        

    }
    
}   

