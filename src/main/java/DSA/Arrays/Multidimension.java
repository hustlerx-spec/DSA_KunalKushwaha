package DSA.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Multidimension {
    public static void main(String[]args){
        /*
        1 2 3
        4 5 6
        7 8 9
         */

        // int[][]arr=new int[3][3];
//        initialziing teh row size is mandatory, col size is not

//        int[][]arr={
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
        Scanner input=new Scanner(System.in);
//        int[][]arr={
//              {1,2,3},//0 th index
//            {4,5},//1st index
//             {6,7,8,9}//2nd
//        };

        int[][]arr=new int[3][3];


        //input
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=input.nextInt();
            }
        }
//        for(int k=0;k<arr.length;k++){
//            for(int s=0;s<arr[k].length;s++){
//                System.out.print(arr[k][s]+" ");
//            }
//            System.out.println();
//        }

           // OUTPUT
//        for(int k=0;k<arr.length;k++){
//            System.out.println(Arrays.toString(arr[k]));
//        }

        // Output
//        for(int[] num:arr){
//            for(int ele:num) {
//                System.out.print(ele + " ");
//            }
//            System.out.println();
//        }

        for(int[] num:arr){
// enhanced for loop
            System.out.println(Arrays.toString(num));
        }

    }

}
