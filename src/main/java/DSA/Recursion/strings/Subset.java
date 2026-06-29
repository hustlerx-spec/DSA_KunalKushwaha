package DSA.Recursion.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
       int[]arr={2,1,2};
       List<List<Integer>> ans1=subset(arr);
        List<List<Integer>> ans2=subsetDuplicates(arr);
//       System.out.println(ans1);
        for(List<Integer> list:ans2){
            System.out.println(list);
        }
    }   /// very very veryyyyyy imp concept

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num:arr){
            int size=outer.size();
            for(int i=0;i<size;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }
    /// ///very verryyyyyy imp concept
    static List<List<Integer>> subsetDuplicates(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start=0;
            //if my current and previous element is same then start=end+1
            if(i>0 &&arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int size=outer.size();
            for(int j=start;j<size;j++){
                List<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
       // my method  ----> gives correct output but complexity raises very high,so not efficient.
//    static List<List<Integer>> subsetwithoutDuplicates(int[] arr) {
//        List<List<Integer>> outer = new ArrayList<>();
//
//        outer.add(new ArrayList<>());
//
//        for(int num:arr){
//            int size=outer.size();
//            for(int i=0;i<size;i++){
//                List<Integer> internal=new ArrayList<>(outer.get(i));
//                internal.add(num);
//                if(outer.contains(internal)){
//                    continue;
//                }else{
//                    outer.add(internal);
//                }
//            }
//        }
//
//        return outer;
//    }
}
