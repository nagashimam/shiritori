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
public class FormChecker {

    public static boolean isValidForm(String word) {
        if (word.matches("^[\\u3040-\\u309F]+$")
                || word.matches("^[\\u30A0-\\u30FF]+$")) {
            return true;
        } else {
            printFormError(word);
            return false;
        }
    }

    private static void printFormError(String word) {
        boolean hasNumber = hasLetter(word, 0x0030, 0x0039);
        boolean hasKanji = hasLetter(word, 0x4E00, 0x9FD5);
        boolean hasHiragana = hasLetter(word, 0x3040, 0x309F);
        boolean hasKatakana = hasLetter(word, 0x30A0, 0x30FF);

        String bgn = "Your input contains";
        String msg = "Enter your word all in hiragana or all in katakana.";
        if (hasNumber) {
            System.out.println(bgn + "number.");
        }
        if (hasKanji) {
            System.out.println(bgn + "Kanji.");
        }
        if (!hasNumber && ! !hasKanji && !hasHiragana && !hasKatakana) {
            System.out.println(bgn + "some letter other than"
                    + " number, Kanji, Hiragana, and Katakana");
        }
        if ((hasNumber || hasKanji)
                || (!hasNumber && !hasKanji && !hasHiragana && !hasKatakana)) {
            System.out.println(msg);
        }

        if (hasHiragana && hasKatakana) {
            System.out.println(bgn + "both Hiragana and Kanji");
            System.out.println("Don't mix the two.");
        }
    }

    private static boolean hasLetter(String word, int from, int until) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= from && word.charAt(i) <= until) {
                return true;
            }
        }
        return false;
    }

}
