/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author ASUS
 */
public class InterfaceBujurSangkar implements InterfaceBangunDatar {
    private double sisi;
    
    public InterfaceBujurSangkar(double sisi){
        this.sisi=sisi;
    }
    public double hitungluas(){
        return sisi*4;
    };
    public double hitungkeliling(){
        return sisi*sisi;
    };
}
