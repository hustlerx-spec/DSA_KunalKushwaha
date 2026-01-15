package DSA.Arrays.BinarySearch;

public class SearchinRotatedArray {
    public static void main(String []args){
        int []nums={4,5,8,10,12,0,1,2,3};
        int target=8;
        int ans=find(nums,target);
        System.out.println(ans);
    }

    static int find(int[] arr, int tar){
        int pivot=pivot(arr);
        if (pivot == -1) {
            return asc(arr, tar);
        }
        else if(arr[pivot]==tar){
            return pivot;
        }
        int ans=(asc2(arr,pivot,tar));
        if(ans==-1){
            ans=asc1(arr,pivot,tar);
        }
        return ans;
    }


    static int pivot(int[]arr){
        int start=0;
        int end=arr.length-1;


        while(start<=end){
            int mid=start+(end - start)/2;


            if(mid< end && arr[mid]>arr[mid+1]) {
                return mid;

            }
            else if(mid>start &&arr[mid]<arr[(mid-1)]) {
                return mid-1;

            }
            else {
                if(arr[start]<arr[mid])
                    start=mid+1;
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }


    static int asc2(int[]arr,int pivot,int tar){
        int start=pivot+1;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end- start)/2;

            if(arr[mid]>tar) {
                end=mid-1;
            }else if(arr[mid]<tar){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int asc1(int[]arr,int pivot,int tar){
        int start=0;
        int end=pivot-1;
        while(start<=end){
            int mid=start+(end- start)/2;

            if(arr[mid]>tar) {
                end=mid-1;
            }else if(arr[mid]<tar){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int asc(int[]arr,int tar){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end- start)/2;

            if(arr[mid]>tar) {
                end=mid-1;
            }else if(arr[mid]<tar){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
