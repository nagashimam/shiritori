/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiritori;

import java.util.Scanner;
import java.lang.StringBuffer;

/**
 *
 * @author KimAnh
 */
public class IOProcessor {

    static Scanner sc = new Scanner(System.in);
    static FormChecker form = new FormChecker();
    static AnsChecker ans = new AnsChecker();

    public static String promptInput(String msg) {
        boolean confirmed = false;
        String word = null;
        while (!confirmed) {
            System.out.println(msg);
            word = sc.next();
            confirmed = confirmInput(word);
        }
        return word;
    }

    private static boolean confirmInput(String word) {
        boolean confirmed = true;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("What you hava entered is " + word + ".");
            System.out.println("Do you want to continue?");
            System.out.println("1. Yes, I want to continue. 2. No, I want to change.");
            String input = sc.next();

            switch (input) {
                case "1":
                    validInput = true;
                    break;
                case "2":
                    confirmed = false;
                    validInput = true;
                    break;
                default:
                    System.out.println("Enter 1 or 2.");
            }
        }
        return confirmed;
    }

    public static String convertToKata(String word) {
        StringBuffer sb = new StringBuffer(word);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c >= '‚Ÿ' && c <= '‚ñ') {
                sb.setCharAt(i, (char) (c - '‚Ÿ' + 'ƒ@'));
            }
        }
        return sb.toString();
    }

}
