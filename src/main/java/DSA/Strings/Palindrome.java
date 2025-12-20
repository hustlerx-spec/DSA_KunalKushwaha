package DSA.Strings;

import java.util.Arrays;

public class Palindrome {
//    public static void main(String [] args) {
//        String first= "NAMANI";
//        int len=first.length();
//
//        StringBuilder second= new StringBuilder();
//
//        for(int i=len-1;i>=0;i--){
//            second.append(first.charAt(i));
//        }
//        System.out.println(second);
//        if(first.equals(second.toString())){
//            System.out.println("a palindrome");
//        }
//        else{
//            System.out.println("not a palindrome");
//        }
//    }


    public static void main(String[] args) {
        String str= "NAMAN";
        System.out.println(palindrome(str));

    }

    static boolean palindrome(String str) {
        if(str==null || str.length() == 0){
            return true;
        }
        str=str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);

            if(start !=end){
                return false;
            }
        }
    return true;}
}
