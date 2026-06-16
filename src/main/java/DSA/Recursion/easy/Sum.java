package DSA.Recursion.easy;

public class Sum {
    public static void main(String[] args) {
        int ans=add(4);
        System.out.println(ans);
    }
    static int add(int n){
        if(n<1){
            return 0;
        }
        return n + add(n-1);
    }

}
