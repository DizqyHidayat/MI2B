/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan1;

/**
 *
 * @author LENOVO
 */
public class Pendaftaran {
    public static void main(String[] args){
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Cindy";
        mhs.nobp = "2101092004";
        mhs.kelas = "MI2B";
        mhs.prodi = "MI";
        mhs.jurusan = "Teknologi Informasi";
        
        System.out.println("Mahasiswa 1");
        System.out.println("Nama    : " +mhs.nama);
        System.out.println("No Bp   : " +mhs.nobp);
        System.out.println("Kelas   : " +mhs.kelas);
        System.out.println("Prodi   : " +mhs.prodi);
        System.out.println("Jurusan : " +mhs.jurusan);
    }
}  

