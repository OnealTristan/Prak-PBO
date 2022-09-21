/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Agent {
    private int health;
    private String name;
    private int pos_x;
    private int pos_y;
    
    public Agent () {
    }
    
    public Agent (String name, int health) {
        this.name = name;
        this.health = health;
    }
    
    public void SetPos (int x, int y) {
        this.pos_x = x;
        this.pos_y = y;
    }
    
    public int GetPos () {
        return 0;
    }
    
    public void Info () {
        System.out.println("Name : " + this.name + " health : " + this.health);
    }
}
