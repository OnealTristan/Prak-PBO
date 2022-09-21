/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Player {
    private int direction;
    private int id;
    private int strength;
    
    public Player () {
    }
    
    public Player (int id, int direction) {
        this.id = id;
        this.direction = direction;
    }
    
    public void AddStrength(int str) {
        this.strength = str;
    }
    
    public void InfoPlayer () {
        System.out.println("Player id : " + this.id + " direction : " + this.direction);
    }
}
