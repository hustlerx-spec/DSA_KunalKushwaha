package DSA.Recursion.strings;

import java.util.ArrayList;

public class DiceThrow {
    public static void main(String[] args) {
        dice("",4);
     System.out.println(diceList("",4));
     diceFace("",4,11);
     System.out.println(diceFaceRet("",4,13));

    }
    //Kunal's code
    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=target && i<=6;i++){
            dice(p+i ,target-i);
        }
    }
      // done by me .and is exact same as kunal's code
    static ArrayList<String> diceList(String p, int target){
        if(target==0){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> ans=new ArrayList<>();
        for(int i=1;i<=target && i<=6;i++){

            ans.addAll(diceList(p+i ,target-i));

        }
        return ans;
    }
    static void diceFace(String p,int target,int face){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=target && i<=face;i++){
            diceFace(p+i ,target-i,face);
        }
    }



    // my method and gives correct answer too
    static void diceThrow(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=target;i++){
            
            char ch=(char)(i +'0'); // converts int to char
             diceThrow(p+ch ,target-i);
        }
    }
    static ArrayList<String> diceFaceRet(String p, int target,int face){
        if(target==0){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> ans=new ArrayList<>();
        for(int i=1;i<=target && i<=face;i++){

            ans.addAll(diceFaceRet(p+i ,target-i,face));

        }
        return ans;
    }
}
