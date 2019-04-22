package MorseCod;

import java.util.HashMap;
import java.util.regex.Pattern;

public class MorseCod {

    public static void main(String[] args) {
        System.out.println(decod("... --- ..."));
        System.out.println(decod("...---..."));
        System.out.println(decod(".... . -.--   .--- ..- -.. ."));
    }

    public static String decod(String morseCode) {

        HashMap<String, String> alphabeticalMorse = new HashMap<String, String>();

        alphabeticalMorse.put(".-", "A");
        alphabeticalMorse.put("-...", "B");
        alphabeticalMorse.put("-.-.", "C");
        alphabeticalMorse.put("-..", "D");
        alphabeticalMorse.put(".", "E");
        alphabeticalMorse.put("..-.", "F");
        alphabeticalMorse.put("--.", "G");
        alphabeticalMorse.put("....", "H");
        alphabeticalMorse.put("..", "I");
        alphabeticalMorse.put(".---", "J");
        alphabeticalMorse.put("-.-", "K");
        alphabeticalMorse.put(".-..", "L");
        alphabeticalMorse.put("--", "M");
        alphabeticalMorse.put("-.", "N");
        alphabeticalMorse.put("---", "O");
        alphabeticalMorse.put(".--.", "P");
        alphabeticalMorse.put("--.-", "Q");
        alphabeticalMorse.put(".-.", "R");
        alphabeticalMorse.put("...", "S");
        alphabeticalMorse.put("-", "T");
        alphabeticalMorse.put("..-", "U");
        alphabeticalMorse.put("...-", "V");
        alphabeticalMorse.put(".--", "W");
        alphabeticalMorse.put("-..-", "X");
        alphabeticalMorse.put("-.--", "Y");
        alphabeticalMorse.put("--..", "Z");
        alphabeticalMorse.put("-----", "0");
        alphabeticalMorse.put(".----", "1");
        alphabeticalMorse.put("..---", "2");
        alphabeticalMorse.put("...--", "3");
        alphabeticalMorse.put("....-", "4");
        alphabeticalMorse.put(".....", "5");
        alphabeticalMorse.put("-....", "6");
        alphabeticalMorse.put("--...", "7");
        alphabeticalMorse.put("---..", "8");
        alphabeticalMorse.put("----.", "9");
        alphabeticalMorse.put(".-.-.-", ".");
        alphabeticalMorse.put("--..--", ",");
        alphabeticalMorse.put(".----.", "'");
        alphabeticalMorse.put("..--..", "?");
        alphabeticalMorse.put("-.-.--", "!");
        alphabeticalMorse.put("-..-.", "/");
        alphabeticalMorse.put("-.--.", "(");
        alphabeticalMorse.put("-.--.-", ")");
        alphabeticalMorse.put(".-...", "&");
        alphabeticalMorse.put("---...", ":");
        alphabeticalMorse.put("-.-.-.", ";");
        alphabeticalMorse.put("-...-", "=");
        alphabeticalMorse.put(".-.-.", "+");
        alphabeticalMorse.put(".--.-.", "@");
        alphabeticalMorse.put("...---...", "SOS");

        String[] strArray=morseCode.trim().split(" ");

        morseCode="";
        for (String nextItem:strArray) {
            morseCode = morseCode + ((alphabeticalMorse.get(nextItem)==null)?" ":alphabeticalMorse.get(nextItem));
        }
       return Pattern.compile("\\s+").matcher(morseCode).replaceAll(" ").trim();
    }
}
