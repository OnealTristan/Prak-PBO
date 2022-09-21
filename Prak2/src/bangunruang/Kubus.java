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
public class Kubus extends BangunRuang{
    
    private float s;
    
    public Kubus (float sisi) {
        this.s = sisi;
    }
    
    @Override
    public void hitungLuas () {
        luas = 6 * s * s;
    }
    
    @Override
    public void hitungKeliling () {
        keliling = 12 * s;
    }
    
    @Override
    public void hitungVolume () {
        volume = s * s * s;
    }
    
}
