package DSA.Sorting_Algorithms;

public class Findsame {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 5, 3, 6, 1};
        System.out.println("duplicate number is " + Dicto(arr));
    }
    static int Dicto(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int temp1 = arr[i];
            int correctIndex = temp1 - 1;
              if (temp1 != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
                return arr[j];
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int first, int sec) {
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
}






