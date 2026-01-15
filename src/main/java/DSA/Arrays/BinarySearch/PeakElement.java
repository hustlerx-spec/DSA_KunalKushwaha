package DSA.Arrays.BinarySearch;

public class PeakElement {
    public static void main(String[]args){
    int []arr={1,7,14,18,12,6,3};

        System.out.println(peak(arr));
}
static int peak(int[]arr){
    int start=0,end=arr.length-1;

    while(start<end){
        int mid=start+(end-start)/2;

        if(arr[mid]>arr[mid+1]){
            end=mid;
        }
//        else if (arr[mid+1]>arr[mid]){
//            start=mid+1;
//        }
        else {
            start=mid+1;         //better version
        }
    }
    return start;
}
}
