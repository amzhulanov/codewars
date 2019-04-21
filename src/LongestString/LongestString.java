package LongestString;

import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestString {
    public static void main(String[] args) {
        String s1="zgheyuia";
        String s2="gwrtyuiop";

        char[] strIn=(s1+s2).toCharArray();
        TreeMap<String, Integer> calcWords = new TreeMap<String, Integer>();
        int lengthStr=strIn.length;
        for (int i=0;i<lengthStr;i++){
            calcWords.put(String.valueOf(strIn[i]),1);
        }
        Pattern p = Pattern.compile("\\s|\\p{Punct}+");
        Matcher m = p.matcher(calcWords.keySet().toString());
        System.out.println("Удалил пробелы и запятые:"+m.replaceAll(""));
    }
}
