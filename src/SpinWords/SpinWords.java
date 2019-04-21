package SpinWords;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class SpinWords {
    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(spinWords("Welcome"));
    }
    public static String spinWords(String sentence){
        String[] strArray=sentence.split(" ");
        sentence="";
        for(String nextItem:strArray){
            if (nextItem.length()>4){
                nextItem=new StringBuffer(nextItem).reverse().toString();
            }
            sentence=sentence+nextItem+" ";
        }
        return sentence.trim();
        //Pattern p = Pattern.compile("\\s+");
        //Matcher m = p.matcher(sentence);
       // return m.replaceAll("");
    }
}
