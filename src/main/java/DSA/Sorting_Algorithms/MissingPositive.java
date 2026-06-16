package DSA.Sorting_Algorithms;

public class MissingPositive {
    public static void main(String[]args){
        int[] arr = {1};
        System.out.println(missing(arr));

    }
    static int missing(int[]arr){
        int i=0;

        while(i<arr.length) {
            int temp1 = arr[i];
            int correctIndex = temp1-1;
            if (correctIndex >= 0  && correctIndex < arr.length && temp1 != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }
            else {
                i++;
            }

        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return arr.length+1;
    }
    static void swap(int[]arr,int first,int sec){
        int temp=arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;
    }

}
