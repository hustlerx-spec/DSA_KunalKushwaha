package DSA.Arrays.linearsearch;
import java.util.Scanner;
import java.util.Arrays;

public class Searchin2D {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [][]arr=new int[3][3];   //  if we are directly initialing the array here , then we dont need to give new int and brackets.
        int target=359;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=in.nextInt();
            }
        }
//        int[]ans=search(arr,target);
        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] search(int[][]arr,int tar){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==tar){
                    return new int[]{i,j};   // here giving brackets and new int is necessary because the array is not declared anywhere.
                }
            }
        }
        return new int[]{-1,-1};
    }



}
