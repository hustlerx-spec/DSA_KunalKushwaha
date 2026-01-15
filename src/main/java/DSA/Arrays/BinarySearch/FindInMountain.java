package DSA.Arrays.BinarySearch;

public class FindInMountain {
    public static void main(String[]args){
        int []arr={1,7,14,18,12,6,3};
        int tar=6;
        System.out.println(position(arr,tar));

    }
    static  int position(int[]arr,int tar){
        int peak=peak(arr);
        int ans=-1;

       if(arr[peak]==tar){
           ans=peak;
       }
       else if(arr[peak]<tar){
         return -1;                 //   not necessary
       }
       else{
          ans= asc(arr,peak,tar);
          if(ans==-1){
              ans=des(arr,peak,tar);
          }
       }
       return ans;
    }
    static int peak(int[]arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else {
                start=mid+1;         //better version
            }
        }
        return start;
    }
    static int asc(int[]arr,int peak,int tar){
        int start=0;
        int end=peak-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>tar){
                end=mid-1;
            }
            else if(arr[mid]<tar){
                start=mid+1;         //better version
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int des(int[]arr,int peak,int tar){
        int start=peak+1;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>tar){
                start=mid+1;
            }
            else if(arr[mid]<tar){
               end=mid-1;         //better version
            }else{
                return mid;
            }
        }
        return -1;
    }
}
