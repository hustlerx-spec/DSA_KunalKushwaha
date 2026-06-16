package DSA.Maths;

public class odd_even {
    public static void main(String[] args) {
        int n=21;
       System.out.println(odd(n)) ;
    }
    static boolean odd(int n){
        if((n & 1)==1){
            return true;
        }
        return false;
    }
}
