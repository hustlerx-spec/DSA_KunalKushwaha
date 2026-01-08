package DSA.Arrays.linearsearch;

public class MaxWealthj {
    public static void main(String[] args) {
        int [] [] arr={
                {3500,6400,2},
                {100,90,540},
                {120,10000,876}
        };
          System.out.println("max wealth is " + maxwealth(arr));

    }
    static int maxwealth(int[][] arr){
        if(arr.length==0){
            return 0;
        }
        int max=0;
//        int max=Integer.MIN_VALUE;
        for (int []arr2: arr){
            int sum=0;
            for(int val:arr2){
                sum=sum+val;
            }
            if(sum>max){
                max=sum;
            }


        }
        return max;
    }

}
