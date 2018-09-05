/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstact_class;

/**
 *
 * @author ASUS
 */
public class AbstractSample {
    public static void main(String[] args) {
        bangunDatar obyek1 = new BujurSangkar(10);
        System.out.println("Luas Bujur Sangkar dengan sisi 10 = "+obyek1.hitungluas());
        System.out.println("Keliling Bujur Sangkar dengan sisi 10 = "+obyek1.hitungkeliling());
        System.out.println("\n");
        
        bangunDatar obyek2 = new Lingkaran(7);
        System.out.println("Luas Lingkaran dengan Jari-Jari 7 = "+obyek2.hitungluas());
        System.out.println("Keliling Lingkaran dengan Jari-Jari 7 = "+obyek2.hitungkeliling());
        System.out.println("\n");
    }
 
}
