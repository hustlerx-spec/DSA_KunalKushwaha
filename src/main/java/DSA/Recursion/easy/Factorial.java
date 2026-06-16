package DSA.Recursion.easy;

public class Factorial {
    public static void main(String[] args) {
        int ans=fac(15);
        System.out.println(ans);
    }
    static int fac(int n){
        if(n<=1){
            return 1;
        }
        return n * fac(n-1);
    }
}
