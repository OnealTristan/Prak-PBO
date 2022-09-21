/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author ASUS
 */
public class Lingkaran extends BangunDatar{
    
    private double phi = 3.14;
    private float r;
    
    public Lingkaran (float jari) {
        this.r = jari;
    }
    
    @Override
    public void hitungLuas () {
        luas = phi * r * r;
    }
    
    @Override
    public void hitungKeliling () {
        keliling = 2 * phi * r;
    }
    
}
