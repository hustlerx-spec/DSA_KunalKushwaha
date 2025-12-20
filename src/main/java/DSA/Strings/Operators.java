package DSA.Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+ 'b');
        //char are converted to thier corresponding ASCII value and then used
        System.out.println("a" + "b");
        //this creates a new object "ab"
        System.out.println((char)('a'+3));

        System.out.println("a" + 1);
        //this is same as "a" + "1" after a few steps
        //integere will be converted to Integer that will call toString()


        System.out.println("Devid" + new ArrayList<>());

        System.out.println("Devid" + new Integer(56));
        String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);
    }
}
