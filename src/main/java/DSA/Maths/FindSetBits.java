package DSA.Maths;

public class FindSetBits {
    public static void main(String[] args) {
        int n=12;
        int set_bits=0;
        while(n>0){
            if((n & 1)==1){
                set_bits++;
            }
            n=n>>1;
        }
        System.out.println(set_bits);
    }

}
