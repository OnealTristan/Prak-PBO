/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Agent agent1 = new Agent();
        Agent agent2 = new Agent("cobaagent", 100);
        
        Player player1 = new Player();
        Player player2 = new Player(10, 5);
        
        agent1.Info();
        agent2.Info();
        
        player1.InfoPlayer();
        player2.InfoPlayer();
    }
    
}
