package Maskify;

import java.nio.CharBuffer;

public class Maskify {
    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
        System.out.println(maskify(     "64607935616"));
        System.out.println(maskify(     "Skippy"));
        System.out.println(maskify(     "Nananananananananananananananana Batman!"));

    }

    public static String maskify(String str){
        int strLength=str.length();
        if (strLength>4){
           str=CharBuffer.allocate( strLength-4).toString().replace( '\0', '#' )+str.substring(strLength-4);
        }
        return str;
    }
}
