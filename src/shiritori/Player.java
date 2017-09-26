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
    static String prevEnd = "Éä";
    static List<String> usedWords = new ArrayList<String>(Arrays.asList("ÉVÉäÉgÉä"));

    boolean lose = false;

    public void play() {
        String msg = "Please enter a word which starts with" + prevEnd;
        String word = say(msg);
        if (IOProcessor.ans.isValidAns(word, prevEnd, usedWords)) {
            this.replacePrevEnd(word);
            usedWords.add(word);
        } else {
            this.lose = true;
        }
        turn++;
    }

    private String say(String msg) {
        boolean validFormat = false;
        String word = null;
        while (!validFormat) {
            word = IOProcessor.promptInput(msg);
            validFormat = IOProcessor.form.isValidForm(word);
        }
        IOProcessor.convertToKata(word);
        return word;
    }

    private void replacePrevEnd(String word) {
        char last = word.charAt(word.length() - 1);
        if (last == 'ÉÉ' || last == 'ÉÖ' || last == 'Éá' || last == 'Å[') {
            this.prevEnd = word.substring(word.length() - 1, word.length() + 1);
        } else {
            this.prevEnd = word.substring(word.length(), word.length() + 1);
        }
    }

    //geters
    public boolean getLose() {
        return this.lose;
    }

    public static int getTurn() {
        return turn;
    }

}
