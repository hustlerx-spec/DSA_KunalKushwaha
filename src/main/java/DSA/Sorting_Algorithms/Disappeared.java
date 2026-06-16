package DSA.Sorting_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//asked in google
class Disappeared {

    public List<Integer> FindDis(int[]arr){

        int i=0;

        while(i<arr.length) {
            int temp1 = arr[i];
            int correctIndex = temp1-1;
             if (temp1 != arr[correctIndex]) {

                swap(arr, i, correctIndex);
            } else {
                i++;
            }

        }

        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
              ans.add(j+1);
            }
        }
        return ans;
    }
     static void swap(int[]arr,int first,int sec){
        int temp=arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;
    }
}
