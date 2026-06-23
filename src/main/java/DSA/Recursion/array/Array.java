package DSA.Recursion.array;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] arr,int index) {
        if(index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }



//                      My method
//    static boolean check(int[] arr) {
//        return helper(arr,0);
//    }
//    static boolean helper(int[] arr,int i) {
//        if (arr.length == 0 || i == arr.length-1) {
//            return true;
//        }
//        if(arr[i]<=arr[i+1]){
//            return helper(arr,i+1);
//        }
//        return false;
//    }
}
