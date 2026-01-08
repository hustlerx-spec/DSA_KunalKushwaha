package DSA.Arrays.Basics;

public class SwapArr {
    public static void main(String[]args){
        int []arr1={12,23,45,67,89};

        System.out.println("Before swap:");
        System.out.println("element at index 1 :" + arr1[1]);
        System.out.println("element at index 2 :" + arr1[2]);
        swap(arr1,1,2);

        System.out.println("After swap:");
        System.out.println("element at index 1 :" + arr1[1]);
        System.out.println("element at index 2 :" + arr1[2]);

    }

   static void  swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
   }

}
