/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menghitungkinetik;

/**
 *
 * @author Mohamad Nafis
 */
public class Kinetic{
     double hasil;

    public double getResult() {
        return hasil;
    }

    public void setResult(double v, double m) {
        this.hasil = 0.5 * m + v * v;
    }
   
}
