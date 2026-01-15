package DSA.Arrays.BinarySearch;

public class Floor {
    public static void main(String[] args) {
        int []arr={2,7,14,18,21,99,208,271,299,301,346,12500,16800,140000};
        int target=12;


        System.out.println(binarysearch(arr,target));
    }
    static int binarysearch(int[]arr,int target){
        int start=0,end=arr.length-1;

        if(target<arr[start]){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
//                if(start==end){
//                    return arr[mid];
//                }
//                logic mistake here.
                end=mid-1;

            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return arr[mid];
            }
        }
        return  arr[end];
    }
}
