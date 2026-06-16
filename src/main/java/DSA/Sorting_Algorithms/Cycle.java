package DSA.Sorting_Algorithms;

import java.util.Arrays;

public class Cycle {
    public static void main(String[] args) {
        int[]arr={3,5,2,1,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[]arr){
        int i=0;
        while(i<arr.length){
            int temp=arr[i];
            int correctIndex=temp-1;
             if(temp!=arr[correctIndex]){
                 swap(arr,i,correctIndex);
            }else{
                 i++;
             }
        }
    }
    static void swap(int[]arr,int first,int sec){
        int temp=arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;
    }


}
