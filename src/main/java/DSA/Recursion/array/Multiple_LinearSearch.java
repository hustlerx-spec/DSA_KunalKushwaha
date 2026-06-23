package DSA.Recursion.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Multiple_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,4,5};
        int val = 4;
//        findIndex(arr, val, arr.length - 1);
//        System.out.println(list);

//        ArrayList<Integer> ans = findAllIndex(arr, val,0,new ArrayList<>());
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> ans = findAllIndex(arr, val,0,list);
        System.out.println(list);
        System.out.println(ans);
        System.out.println(findAllIndex2(arr, val,0));
    }



    static ArrayList<Integer> list = new ArrayList<>();
    static void findIndex(int[] arr, int val, int index) {
        if (index == -1) {
            return;
        }
        if (arr[index] == val) {
            list.add(index);
        }
        findIndex(arr, val, index - 1);
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int val, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == val) {
            list.add(index);
        }
        return findAllIndex(arr, val, index + 1, list);
    }
    static ArrayList<Integer> findAllIndex2(int[] arr, int val, int index) {
        ArrayList<Integer> list=new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        // this will contain answer for that specific function call only
        if (arr[index] == val) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls=findAllIndex2( arr,  val, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
