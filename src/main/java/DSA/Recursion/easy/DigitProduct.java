package DSA.Recursion.easy;

public class DigitProduct {
    public static void main(String[] args) {

            int ans=Product(505);
            System.out.println(ans);
        }


        static int Product(int n) {
            if(n%10==n){
                return n;
            }
          return  (n%10)*Product(n/10);
        }
}
