package DSA.Arrays.Basics;
import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[]args){

//        Array of primitives
//        int arr[]=new int[5];
//        Scanner input=new Scanner(System.in);
//
//        for(int i=0;i<arr.length;i++){
//            arr[i]=input.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));  //one more way to print
//
//        for(int i=0;i<arr.length;i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//            for(int num:arr){  // for each loop
//                System.out.print(num+" ");  // here num represents array element.
//            }

          // Array of objects
        Scanner input=new Scanner(System.in);
        String[] arr=new String[7];
        for(int j=0;j<=arr.length-1;j++){
            arr[j]=input.next();
        }
        System.out.println(Arrays.toString(arr));
        }
    }

