package DSA.Recursion;

public class BS {
    public static void main(String[] args) {
        int[]arr={34,68,79,90,110,135,412,911};
        int target=135;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[]arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(target==arr[mid]){
            return mid;
        }
        if(target<arr[mid]){
            return search(arr,target,s,mid-1);
        }
        return search(arr,target,mid+1,e);
    }

}
