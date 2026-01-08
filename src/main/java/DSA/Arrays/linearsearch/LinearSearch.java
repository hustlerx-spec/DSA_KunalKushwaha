package DSA.Arrays.linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int []arr={29,567,358,2099,21222};
        int target=358;
        int res=linearsearch(arr,target);
        System.out.println(res);
    }

    static int linearsearch(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==target){
                return i;
            }
        }

       return -1;
    }

}
