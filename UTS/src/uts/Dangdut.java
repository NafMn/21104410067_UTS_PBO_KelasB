/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author Mohamad Nafis
 */
class Dangdut {

    String penyanyi = "Ayu Ting Ting";
    private String lagu = "Alamat Palsu";

    public Dangdut() {
    }
    void singer(String penyanyi){
        this.penyanyi = penyanyi;
    }

    void song(String via_Vallen, String kopi_Dangdut) {
        this.lagu = lagu;
    }

    void cetakLabel() {
        System.out.println(this.penyanyi + " <=> " + this.lagu);
    }
    
}
