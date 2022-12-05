/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menghitungkinetik;

import java.util.Scanner;

/**
 *
 * @author Mohamad Nafis
 */
public class MainEnergi {
    
    public static void main(String [] args){
        Kinetic kinetic = new Kinetic();
       double m = 0,v = 0;
       final Scanner scanner= new Scanner(System.in);
       
        
        System.out.print("Masukkan Massa benda(Kg): ");
         m = scanner.nextDouble();
        System.out.print("Masukkan Kecepatan(m/s): ");
        v = scanner.nextDouble();
        kinetic.setResult(m,v);
        System.out.println("Energi Kineticnya: " + kinetic.getResult());
    }   
    
}
