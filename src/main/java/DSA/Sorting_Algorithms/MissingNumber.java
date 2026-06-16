package DSA.Sorting_Algorithms;




//asked in  amazon



public class MissingNumber {
    public static void  main(String[] args){
        int[]arr={9,7,8,0,6,5,3,1,4};

        System.out.println("missing number is "+ Find(arr));
    }
    static int Find(int[]arr){
        int i=0;

        while(i<arr.length) {
            int temp1 = arr[i];
            int correctIndex = temp1;
            if (correctIndex > arr.length - 1) {
                i++;
            } else if (temp1 != arr[correctIndex]) {

                swap(arr, i, correctIndex);
            } else {
                i++;
            }
            //does the same
//            if (correctIndex <= arr.length - 1 && temp1 != arr[correctIndex]){
//                swap(arr, i, correctIndex);
//            }
//            else {
//                i++;
//            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
        }
    static void swap(int[]arr,int first,int sec){
        int temp=arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;
    }
}
