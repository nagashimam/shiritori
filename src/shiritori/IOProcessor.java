/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiritori;

import java.util.Scanner;

/**
 *
 * @author KimAnh
 */
public class IOProcessor {
    static Scanner sc = new Scanner (System.in);
    static FormChecker form = new FormChecker ();
    static AnsChecker ans = new AnsChecker ();
    
    public static String promptInput (){
        String word = null;
        return word; 
    }
    private static boolean confirmInput (String word){
        return true;
    }
    private static String convertToKata (String word){
        return word;
    }
    
}
