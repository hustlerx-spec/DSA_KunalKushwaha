package DSA.Arrays.Basics;

public class Maxvalue {
    public static void main(String[] args) {
        int []arr={2356,78900,1254,336,0,289,456};
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print(max);
    }
}
