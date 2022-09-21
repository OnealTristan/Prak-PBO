/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author ASUS
 */
public class Bola extends BangunRuang{
    
    private float r;
    private double phi = 3.14;
    
    public Bola (float jari) {
        this.r = jari;
    }
    
    @Override
    public void hitungLuas () {
        luas = 4 * phi * r * r;
    }
    
    @Override
    public void hitungKeliling () {
        keliling = 4/3 * phi * r * r;
    }
    
}
