package DSA.Recursion.easy;

public class ReverseTheNumber {
    static int sum=0;
    static void rev1(int n){
        if(n==0) {
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev1(n/10);
    }
    public static void main(String[] args) {
        rev1(1234);
        System.out.println(sum);


        int ans=reverse(32451);
        int ans1=reverse_byrecursion(32451,0);
//        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(rev2(ans1));
    }
    // by recursion
    static int reverse_byrecursion(int n,int rev){
        if(n==0){
            return rev;
        }
//        if(n/10==n){
//            return rev;
//        }  works the same
        int rem=n%10;
        rev=rev*10+rem;
        return reverse_byrecursion(n/10,rev);
        }
    static int reverse(int n){
        int rev=0;
        if(n==0)
            return 0;
        while(n!=0){
            int rem=n%10;
            n=n/10;
            rev=rev*10+rem;
        }
        return rev;
    }
    static int rev2(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    private static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem * (int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }
}
