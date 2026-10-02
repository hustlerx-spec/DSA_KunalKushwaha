package DSA.Strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String phrase=new String("A man in the middle");
        System.out.print(phrase);
       String lower= phrase.toLowerCase();
        System.out.print(lower);
       char[]arr= phrase.toCharArray();
       Arrays.sort(arr);
       System.out.print(Arrays.toString(arr));
       String ans=Arrays.toString(arr);
       System.out.print(ans);



    }
}
