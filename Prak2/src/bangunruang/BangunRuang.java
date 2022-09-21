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
public class BangunRuang {
    
    protected double luas;
    protected double keliling;
    protected double volume;
    
    public void hitungLuas () {
        System.out.println("Hitung Luas !\n");
    }
    
    public void hitungKeliling () {
        System.out.println("Hitung Keliling !\n");
    }
    
    public void hitungVolume () {
        System.out.println("Hitung Volume !\n");
    }
    
    public void printInfo () {
        System.out.println("Luas = " + luas);
        System.out.println("Keliling = " + keliling);
        System.out.println("Volume = " + volume);
    }
    
}
