/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiritori;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author KimAnh
 */
public class Player {
    static int turn = 0;
    static String prevEnd = "ƒŠ";
    static List <String> usedWords = new ArrayList <String> (Arrays.asList("ƒVƒŠƒgƒŠ"));
    
    boolean lose = false;
    
    public void play(){
        turn ++;
    }
    private String say(){
        String word = null;
        return word;
    }
    private void replacePrevEnd (String word){
        
    }
    
    //geters
    public boolean getLose (){
        return this.lose;
    }
    public static int getTurn (){
        return turn;
    }
    
    
}
