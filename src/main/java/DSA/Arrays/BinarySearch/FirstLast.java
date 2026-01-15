package DSA.Arrays.BinarySearch;

import java.util.Arrays;

public class FirstLast {
    public static void main(String[] args) {
        int []arr={5,7,7,8,8,10};
        int target=8;
        int [] answer=position(arr,target);
        System.out.println(Arrays.toString(answer));
    }
    static int[] position(int []arr,int target){
        int []ans={-1,-1};
        ans[0]=searchinrange(arr,target,true);
        ans[1]=searchinrange(arr,target,false);
        return ans;
    }

    static int  searchinrange(int[]arr,int target,boolean firstoccurence){
        int start=0;
        int end=arr.length-1;
        int index=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                  index=mid;
                 if(firstoccurence){

                     end=mid-1;
                 }
                 else{

                         start=mid+1;

                 }
            }
        }

        return index;
    }
}
