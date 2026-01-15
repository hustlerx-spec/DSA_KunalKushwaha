package DSA.Arrays.BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 7, 14, 18, 21, 99, 208, 271, 299, 301, 346, 12500, 16800, 140000};
        int target = 271;
        findrange(arr,target);
    }
       static void findrange(int [] arr,int target){
           int start=0;
           int end=1;
           while(target>arr[end]){
               int temp=end+1;
               //end=end+ sizeofbox*2
               end=end+(end-start+1)*2;
               start=temp;
           }
           System.out.println(search(arr,target,start,end));

       }

    static int search(int[]arr,int target,int start,int end){

        while(start<=end){
            int mid= start+(end-start)/2;
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
