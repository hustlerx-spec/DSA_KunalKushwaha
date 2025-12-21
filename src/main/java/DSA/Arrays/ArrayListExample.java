package DSA.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //Syntax
//        ArrayList<Integer> list = new ArrayList<Integer>(10);   not necessary
//        ArrayList list = new ArrayList<Int>(10);   // valid but not a good practice

        ArrayList<Integer> list = new ArrayList<>(5);// recommended
        //here we cant pass primitives we have to pass the wrapper classes.

//        list.add(67);
//        list.add(234);
//        list.add(671);
//        list.add(5577);
//        list.add(6786);
//        list.add(670);
//        list.add(764000);
//        list.add(89100);
//        list.add(22);
//
//
//        System.out.println(list);
//
//        list.set(0,99);
//        list.remove(0);
//        System.out.println(list);

        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }

        for(int i=0;i<5;i++){
            System.out.println(list.get(i));//pass index here , list[index] syntax will not work.
        }

    }
}
