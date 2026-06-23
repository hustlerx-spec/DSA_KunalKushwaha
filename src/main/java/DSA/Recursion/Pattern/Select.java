package DSA.Recursion.Pattern;

import java.util.Arrays;
   //my method
public class Select {
    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 1};
        selection(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr, int n) {
        if (n > 0) {
            int ans=maxIndex(arr,0,1,n);

                int temp = arr[ans];
                arr[ans] = arr[n];
                arr[n] = temp;
                selection(arr, n - 1);
            }
        }
    static int maxIndex(int[]arr,int max,int i,int n){
        if(i>n){
            return max;
        }
            if (arr[max] < arr[i]) {
                max = i;
            }
             return maxIndex(arr,max,i+1,n);

        }
    }





