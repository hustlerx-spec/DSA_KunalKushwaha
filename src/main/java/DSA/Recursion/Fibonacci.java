package DSA.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
       int ans= fib(7);
//       System.out.print(ans);
       for(int i=0;i<50;i++){
          System.out.println(fiboFormula(i));
       }

    }
    static int fiboFormula(int n){
//        just for demo,use long instead
        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));

//        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
//        gives same correct result because Math.pow(((1-Math.sqrt(5))/2),n)) is less dominating term.
    }

    static int fib(int n){
        //base condition
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
