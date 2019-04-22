package Disemvowel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Troll {
    public static void main(String[] args) {
        System.out.println(disemvowel("What are you, a communist?"));
        System.out.println(disemvowel("No offense but,\\nYour writing is among the worst I've ever read"));
        System.out.println(disemvowel("This website is for losers LOL!"));
    }
    public static String disemvowel(String str){
        Pattern p = Pattern.compile("[euioaEUIOA]+");
        Matcher m = p.matcher(str);
        return m.replaceAll("");
    }
}
