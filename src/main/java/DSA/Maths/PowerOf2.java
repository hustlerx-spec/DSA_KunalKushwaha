package DSA.Maths;

public class PowerOf2 {
    public static void main(String[] args) {
        int n=2048;
        int temp=n;
        int count=0;
        while(temp>0){
            int last=temp & 1;
            if(last==1){
                count++;
            }
            temp=temp>>1;

        }
        if(count==1){
            System.out.println(n + " is a power of 2");
        }else{
            System.out.println(n + " is not a power of 2");
        }
//        int n1=32;    //note: fix for  n=0 , just return false.
//        boolean ans= (n1 & (n1-1))==0;                         Method 2
//        System.out.println(ans);
    }


}
