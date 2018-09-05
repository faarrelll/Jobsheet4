/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading_method;

/**
 *
 * @author ASUS
 */
public class TesTugas1 {
     public static void main(String[] args) {
        RataNilai rn = new RataNilai();
        System.out.println("Rerata nilai 21 dan 13 adalah : "+rn.average(21, 13));
        System.out.println("Rerata nilai 19.3 dan 39.4 adalah : "+rn.average(19.3, 39.4));
        System.out.println("Rerata nilai 129, 567 dan 744 adalah : "+rn.average(129, 567,744));
    }
}
