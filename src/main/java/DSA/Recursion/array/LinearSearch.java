package DSA.Recursion.array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 18, 4, 5};
        System.out.println(find(arr,18,0));


    }
    static boolean find(int[] arr,int val,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==val || find(arr,val,index+1);
    }





         //My method
//    static boolean Find(int[] arr,int target,int i){
//        if(i==arr.length){
//            return false;  // if you want to return index then return -1 .
//        }
//        if( arr[i]==target ){
//            return true ;
//        }    // if you want to return index then return i .
//       return Find(arr,target,i+1);
//    }
}
