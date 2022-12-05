/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author Mohamad Nafis
 */
class Pop {

    private String penyanyi;
    private String lagu;

    public Pop() {
    }
    Pop(String penyanyi, String lagu){
        this.penyanyi = penyanyi;
        this.lagu = lagu;
        System.out.println(this.penyanyi+" <=> "+this.lagu);
    }
    public void singer(String penyanyi){
        this.penyanyi = penyanyi;
    }
    
    protected void song(String lagu){
        this.lagu = lagu;
    }

    
    void Cetaklabel() {
        System.out.println(this.penyanyi +" <=> "+this.lagu);
    }
    
}
