package DSA.Arrays.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr={1,7,14,18,21,99,208,271,299,301,346,12500,16800,140000};
        int target=301;
        System.out.println(binarysearch(arr,target));
    }
    static int binarysearch(int[]arr,int target){
       int start=0,end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
