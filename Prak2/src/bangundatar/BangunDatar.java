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
public class BangunDatar {
    
    protected double luas;
    protected double keliling;
    
    public void hitungLuas () {
        System.out.println("Hitung Luas !\n");
    }
    
    public void hitungKeliling () {
        System.out.println("Hitung Keliling !\n");
    }
    
    public void printInfo () {
        System.out.println("Luas = " + luas);
        System.out.println("Keliling = " + keliling);
    }
    
}
