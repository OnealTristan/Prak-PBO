/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Sport extends Car {
    private String color, engine;
    
    public Sport () {
        color = "Red";
        engine = "BMW";
    }
    
    public Sport (String col, String eng) {
        this.color = col;
        this.engine = eng;
    }

    @Override
    public void sound() {
        System.out.println("Nguuunnggg...");
    }

    @Override
    public String toString() {
        return "Sport{" + "color=" + color + ", engine=" + engine + '}';
    }    
    
    
}
