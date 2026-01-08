package DSA.Arrays.Basics;

public class Reverse {
    public static void main(String[] args){
        int []arr2={12,23,45,67,89};
        int start=0;
        int end=arr2.length-1;

//        for(int i=0;i<arr2.length/2;i++){
//            int temp=arr2[start];
//            arr2[start]=arr2[end];
//            arr2[end]=temp;
//
//            start++;
//            end--;
//        }  this for loop is also 100 % correct for solving this que but since we are not using i inside loop even once that is why while is used below and it is the optimal best solution.

        while(start<end){    // this is known as 2 pointer method.
            int temp=arr2[start];
            arr2[start]=arr2[end];
            arr2[end]=temp;

            start++;
            end--;
        }
        System.out.println("After reversing the array:");
        for(int i=0;i<arr2.length;i++){
          System.out.println("at index " + i + ":" + arr2[i]);

        }



    }
}
