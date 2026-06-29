package DSA.Recursion.strings;

import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
//   subseq("","abc");
        ArrayList<String>ans=new ArrayList<>();
        System.out.print(subseqlistRet("","abc"));
    }

    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }
       //my method --gives same answer as kunal but fxn body is different
    static ArrayList<String> subseqlistRet( String p, String up){
        ArrayList<String> list=new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        list.addAll(subseqlistRet(p+ch,up.substring(1)));
        list.addAll(subseqlistRet(p,up.substring(1)));
    return   list;
    }
//    static ArrayList<String> subseqlistRet( String p, String up){
//
//        if(up.isEmpty()){
//            ArrayList<String> list=new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//        char ch = up.charAt(0);
//        ArrayList<String> left=subseqlistRet(p+ch,up.substring(1));
//        ArrayList<String> right=subseqlistRet(p,up.substring(1));
//    left.addAll(right);
//        return   left;
//    }



//           My work   --> works correctly ,same as kunal, but passing list as argument is easy work.
//    static ArrayList<String> subseqlist(ArrayList<String> list, String p, String up){
//        if(up.isEmpty()){
//            list.add(p);
//            return list;
//        }
//        char ch = up.charAt(0);
//        subseqlist(list,p+ch,up.substring(1));
//        subseqlist(list,p,up.substring(1));
//    return   list;
//    }
}
