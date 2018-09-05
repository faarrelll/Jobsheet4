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
public class BujurSangkar extends bangunDatar{
    private double sisi;
    
    public  BujurSangkar(double sisi){
        this.sisi = sisi;
    }
    @Override
    public double hitungkeliling(){
        return 4* sisi;
    }
    @Override
    public  double hitungluas(){
        return sisi*sisi;
    }
}
