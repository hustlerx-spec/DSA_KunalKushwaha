package DSA.Recursion.Backtracking;

import java.util.ArrayList;

// Que 1)
public class Maze {
    public static void main(String[] args) {
//         System.out.println(count(3,3));
//         path("",3,3);
         System.out.println(pathRetDiagonal("",3,3));
    }
    static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);

        return left+right;
    }
    static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }
    static ArrayList<String> pathRet(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String>list=new ArrayList<>();

        if(r>1){
            list.addAll(pathRet(p+"D",r-1,c));
        }
        if(c>1){
            list.addAll(pathRet(p+"R",r,c-1));
        }
        return list;
    }

    //my appraoch but literally same code and exact output as Kunal..(khud se kiya)
    static ArrayList<String> pathRetDiagonal(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String>list=new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(pathRetDiagonal(p+"D",r-1,c-1));
        }
        if(r>1){
            list.addAll(pathRetDiagonal(p+"V",r-1,c));
        }
        if(c>1){
            list.addAll(pathRetDiagonal(p+"H",r,c-1));
        }
        return list;
    }

    // my code but exact same output as kunal...
    static ArrayList<String> PathRet(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String>left=new ArrayList<>();
        ArrayList<String> right=new ArrayList<>();
        if(r>1){
             left=PathRet(p+"D",r-1,c);
        }
        if(c>1){
             right=PathRet(p+"R",r,c-1);
        }
        left.addAll(right);

        return left;
    }


    //my approach gives same result as kunal but not better return.
    static ArrayList<String> Path(String p,int r,int c){
        if(r==1 || c==1){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> left=Path(p+"D",r-1,c);
        ArrayList<String> right=Path(p+"R",r,c-1);

        left.addAll(right);

        return left;
    }















    //  my method ...but gives 100 percent correct answer and same efficiency.
    static int counts(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int count=0;
        count=counts(r,c-1)+count(r-1,c);

    return count;
    }
}
