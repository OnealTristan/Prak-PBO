import bangundatar.BangunDatar;
import bangunruang.BangunRuang;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Bangun Datar : \n");
        bangundatar.Lingkaran lingkaran = new bangundatar.Lingkaran(5);
        System.out.println("Lingkaran :");
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();
        lingkaran.printInfo();
        
        bangundatar.Persegi persegi = new bangundatar.Persegi(10);
        System.out.println("\nPersegi :");
        persegi.hitungLuas();
        persegi.hitungKeliling();
        persegi.printInfo();
        
        bangundatar.PersegiPanjang persegipan = new bangundatar.PersegiPanjang(5, 10);
        System.out.println("\nPersegi Panjang :");
        persegipan.hitungLuas();
        persegipan.hitungKeliling();
        persegipan.printInfo();
        
        System.out.println("\nBangun Ruang : \n");
        bangunruang.Balok balok = new bangunruang.Balok(5, 4, 3);
        System.out.println("Balok : ");
        balok.hitungLuas();
        balok.hitungKeliling();
        balok.hitungVolume();
        balok.printInfo();
        
        bangunruang.Bola bola = new bangunruang.Bola(4);
        System.out.println("\nBola : ");
        bola.hitungLuas();
        bola.hitungKeliling();
        bola.printInfo();
        
        bangunruang.Kubus kubus = new bangunruang.Kubus(5);
        System.out.println("\n Kubus : ");
        kubus.hitungLuas();
        kubus.hitungKeliling();
        kubus.hitungVolume();
        kubus.printInfo();
        
    }
    
}
