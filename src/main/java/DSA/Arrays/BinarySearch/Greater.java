package DSA.Arrays.BinarySearch;

public class Greater {
    public static void main(String[]args){
        char []arr={'b','g','m','p','y'};
        char k='y';
        System.out.println(greater(arr,k));
    }
    static char greater(char[]arr,char k){
        int start=0;
        int end=arr.length-1;
        if(k>=arr[arr.length-1]){
            return arr[start];
        }
        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>k){
                end=mid-1;
            }
            else if(arr[mid]<=k){
                start=mid+1;
            }
        }
        return arr[start];


    }
}
                //Professional solution down here
//static char greater(char[]arr,char k){
//    int start=0;
//    int end=arr.length-1;
//    if(k>=arr[arr.length-1]){
//        return arr[start];
//    }
//    while(start<=end){
//        int mid=(start+end)/2;
//
//        if(arr[mid]>k){
//            end=mid-1;
//        }
//        else{
//            start=mid+1;
//        }
//    }
//    return arr[start%arr.length];
//}
