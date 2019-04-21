package CamelCase;

public class CamelCase {
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("The_Stealth_Warrior"));
    }

    static String toCamelCase(String s) {
        String[] strArray;

            strArray = s.split("[-_]");

           

        int sizeArray=strArray.length;
        s=strArray[0];
        for (int i=1;i<sizeArray;i++){
            s=s+strArray[i].substring(0,1).toUpperCase()+strArray[i].substring(1);
        }
        return s;
    }
}
