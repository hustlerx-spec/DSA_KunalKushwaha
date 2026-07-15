package DSA.OOPS.oops2.staticExample;

public class StaticBlock {
    static int a=4;
    static int b;

    static {
        System.out.println("Static Block");
        b=a*5;

    }/// this static block will only run once , when first objectis created .i.e.
    ///  when class is  loaded for the very first time.

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();

        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock.b+=3;
        System.out.println(StaticBlock.a+" "+StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();

        System.out.println(StaticBlock.a+" "+StaticBlock.b);


    }

}
