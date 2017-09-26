/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shiritori;

import java.util.List;

/**
 *
 * @author KimAnh
 */
public class AnsChecker {

    public static boolean isValidAns(String word, String prevEnd, List<String> usedWords) {
        return startsWithPrevEnd(word, prevEnd) && isNotUsedWords(word, usedWords) && !endsWithN(word);
    }

    private static boolean startsWithPrevEnd(String word, String prevEnd) {
        return prevEnd.equals(word.substring(0, prevEnd.length()));
    }

    private static boolean isNotUsedWords(String word, List<String> usedWords) {
        return usedWords.indexOf(word) == -1;
    }

    private static boolean endsWithN(String word) {
        return word.charAt(word.length() - 1) == 'ƒ“';
    }

}
