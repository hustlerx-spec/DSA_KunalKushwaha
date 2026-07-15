package DSA.OOPS.Introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a=10;
//        int b=20;     primitives

           ///  initialized as object
//        Integer num=new Integer(45);
//        Integer num=45;


        Integer a=10;
        Integer b=20;
        swap(a,b);

        System.out.println(a + " "+b);

        // final int bonus=2;
        //bonus=3;
        // final keyword doesnt allow the variable to be modified.


       final A Kunal=new A("Kunal Kushwaha");
       Kunal.name="other name";
//when a non primitive is final,you cant reassign it.
//       Kunal=new A("other obj");

        A obj;
        for(int i=0;i<1000000000;i++){
            obj=new A("random");
        }




    }
    static void swap(int a,int b){
        int temp=a;
        a=b;    // this function wont swap a and b because these are primitives and java is pass by value
        //that is only 10 is passed in argument not the reference variable a;
        b=temp;
    }
    static void swap(Integer a,Integer b){
        int temp=a;
        a=b;
        b=temp;
    }    // here even after passing as objects it wont swap because Integer is a "final" class.


}
class A{
//    final int time;
//    gives an error , coz you have to initialize it while declaring ,coz it cant be modified.

    final int num=10;
    String name;

    public A(String name){
//        System.out.println("object is created");
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
       System.out.println("object is destroyed");
    }
}
