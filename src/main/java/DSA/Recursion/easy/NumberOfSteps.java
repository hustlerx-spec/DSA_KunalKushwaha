package DSA.Recursion.easy;

public class NumberOfSteps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(41));
    }
    public static int numberOfSteps(int num) {
        return helper(num,0);
    }
    static int helper(int num,int s){
        if(num==0){
            return s;
        }
        if(num%2==0){
            return helper(num/2,s+1);
        }else{
            return helper(num-1,s+1);
        }
    }
}
