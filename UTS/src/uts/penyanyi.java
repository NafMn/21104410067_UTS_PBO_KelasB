/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author Mohamad Nafis
 */
public class penyanyi extends Pop{

    private static String penyayi;
    public static void main(String [] args){
        Pop pop = new Pop("Black Pink", "How You Like That");
        Dangdut dangdut = new Dangdut();
    
        pop.singer("Eclat Story");
        pop.song("Bentuk Cinta");
        pop.Cetaklabel();
        
        String penyanyi = "Joko Chandra";
        penyayi = dangdut.penyanyi;
        dangdut.song("Via Vallen", "Kopi Dangdut");
        dangdut.cetakLabel();
    
    }
   
}
