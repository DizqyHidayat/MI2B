/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class KelasInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Nama");
        Person p= new Person();
        p.setName(sc.nextLine());
        System.out.println("Nama Anda Adalah"+
                p.getName());
    }
}
