package DSA.Recursion.easy;

public class CountZeros {
    public static void main(String[] args) {
        int ans = count(3200406);
        System.out.println(ans);
    }

    static int count(int n) {
        return helper(n,0);
  // Note : its a standard practice to use helper function when we need
        // to pass more than one argument.
    }

    // special pattern how to pass a value to above calls
    private static int helper(int n, int c) {
        if (n == 0) {
            return c;   // this c is only hit once
        }
        int rem=n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }

//    static int count1(int n,int c) {
//        if (n == 0) {
//            return c;
//        }
//        int rem=n%10;
//        if(rem==0){
//            c=c+1;
//        }
//       return count(n/10,c);
//
//    }
}
