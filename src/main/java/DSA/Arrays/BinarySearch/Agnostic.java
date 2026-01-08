package DSA.Arrays.BinarySearch;

public class Agnostic {
    public static void main(String[] args) {


        int[] arr1 = {23, 56, 71, 78, 1205, 3979, 4001, 5034, 6778};
        int[] arr2 = {12349, 9000, 800, 786, 578, 420, 78};
        int target = 78;

        System.out.print(agnostic(arr1,target));
    }
   static int agnostic(int[]arr,int target){
        int start=0;
        int end=arr.length-1;

       boolean isAsc=arr[start]<arr[end];

//        if(arr[start]>arr[end]){
//            isAsc=false;
//        }

       while(start<=end){
           int mid=start+(end-start)/2;

           if(arr[mid]==target){
               return mid;
           }

           if(isAsc){
               if(target<arr[mid]){
                   end=mid-1;
               }
               else if(target>arr[mid]){
                   start=mid+1;
               }
           }
           else {
               if(target<arr[mid]){
                   start=mid+1;
               }
               else if(target>arr[mid]){  // here we can only keep else because case for target==mid is already handled above but we should prefer clean while writing.
                   end=mid-1;
               }
           }



       }
        return -1;
   }
}
