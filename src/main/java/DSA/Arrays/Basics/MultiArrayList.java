package DSA.Arrays.Basics;
import java.util.Scanner;
import java.util.ArrayList;

public class MultiArrayList {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(4);

        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               System.out.println(list.get(i).get(j));
            }
        }
    }
}
