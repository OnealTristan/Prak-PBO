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
public class Balok extends BangunRuang{
    
    private float p;
    private float l;
    private float t;
    
    public Balok (float pnjng, float lbr, float tngg) {
        this.p = pnjng;
        this.l = lbr;
        this.t = tngg;
    }
    
    @Override
    public void hitungLuas () {
        luas = 2 * ((p * l) + (p * t) + (p * t));
    }
    
    @Override
    public void hitungKeliling () {
        keliling = 4 * (p + l + t);
    }
    
    @Override
    public void hitungVolume () {
        volume = p * l * t;
    }
    
}
