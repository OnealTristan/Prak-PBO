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
public class PersegiPanjang extends BangunDatar{
    
    private float p;
    private float l;
    
    public PersegiPanjang (float pnjng, float lbr) {
        this.p = pnjng;
        this.l = lbr;
    }
    
    @Override
    public void hitungLuas () {
        luas = p * l;
    }
    
    @Override
    public void hitungKeliling () {
        keliling = 2 * (p + l);
    }
    
}
