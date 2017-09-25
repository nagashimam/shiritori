/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiritori;

/**
 *
 * @author KimAnh
 */
public class Shiritori {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player a = new Player();
        Player b = new Player();
        
        while (!a.getLose() && !b.getLose()){
            if (Player.getTurn()%2 == 0){
                a.play();
            } else {
                b.play();
            }
        }
    }
    
}
