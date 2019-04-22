package WhichAreIn;

import java.util.SortedSet;
import java.util.TreeSet;
//import static java.util.Arrays.stream;

public class WhichAreIn {

    public static void main(String[] args) {
       //String a[] = new String[] { "arp", "live", "strong" };
        String a[] = new String[] { "tarp", "mice", "bull" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };

        a=inArray(a,b);
        for (String nextItem:a){
            System.out.println(nextItem);
        }
    }


    private static String[] inArray(String[] array1, String[] array2) {

        SortedSet<String> strArray=new TreeSet<>();
        for (int i = 0; i <array1.length ; i++) {
            for (int j = 0; j <array2.length ; j++) {
                if(array2[j].contains(array1[i])){
                    strArray.add(array1[i]);
                }
            }
        }
        String[] r=new String[strArray.size()];
                r=strArray.toArray(r);

        return r;
        //return stream(array1).filter(s1 -> stream(array2).anyMatch(s2 -> s2.contains(s1))).sorted().distinct().toArray(String[]::new); //решение с codewars
    }
}
