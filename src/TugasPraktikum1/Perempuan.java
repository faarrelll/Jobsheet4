/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum1;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Perempuan extends Manusia{
    public Perempuan(double TB){
        this.Tinggibadan=TB;
    }
    public final double htgbbi(){
        return ((Tinggibadan - 100) - ((Tinggibadan - 100) * 15/100));
    }
    
    
}
