package DSA.Recursion.easy;

public class DigitSum {
    public static void main(String[] args) {
        int ans=sumRecursion(13742);
        System.out.println(ans);
    }

    // by recursion
    static int sumRecursion(int n) {
        if(n==0){
            return 0;
        }
//          int rem=n%10;
//        return  rem+sumRecursion(n/10);
        return  (n%10)+sumRecursion(n/10);
    }
    //by normal ...
    static int sum(int n) {
        int sum=0;

        while(n!=0){
            int  temp=n;
            int rem=temp%10;
            sum+=rem;
            n=temp/10;

        }
        return sum;
    }

}
