package DSA.Arrays.linearsearch;



public class Evendigits {
    public static void main(String[]args){
        int []arr={1,378,29,1256,4000};

     System.out.print(even(arr));

    }
    static int even(int[]arr){
        String [] arr1=new String[arr.length];

       int count=0;
        for(int j=0;j<arr.length;j++){
            int len;    // those vars who will be not used outside block declare them inside only.
            arr1[j]=String.valueOf(arr[j]);
//            arr2=arr1[j].toCharArray();         no need of this becyas we can also count chars in a string directly using length fxn.
            len=arr1[j].length();

            if(len%2==0){
                count++;
            }

        }
        return count;
    }
}



// Alternative method for this question -- count the number of digits.. in every number and if contains even no of digigts return tur and inccrease count ...
//1. use while loop till number is greater than 0 for counting number of digits ( do n /10).
//               Optimal Solution
//   for counting digits use Math.log function
