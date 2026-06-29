package DSA.Recursion.strings;

import java.util.ArrayList;

public class Ascii {
    public static void main(String[] args) {

//        subseq("","abc");
        System.out.print('a'+0);  // ascii value  ..gives 97
        System.out.println(subseqAsciiret("","abc"));
    }
    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
        subseq(p+(ch+0),up.substring(1));
    }
    static ArrayList<String> subseqAsciiret(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first= subseqAsciiret(p+ch,up.substring(1));
        ArrayList<String> second= subseqAsciiret(p,up.substring(1));
        ArrayList<String> third= subseqAsciiret(p+(ch+0),up.substring(1));
    first.addAll(second);
        first.addAll(third);
        return   first;
    }
}
