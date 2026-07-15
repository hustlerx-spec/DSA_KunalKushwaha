package DSA.OOPS.oops2.staticExample;



//  this class cant be static because this is the outer class so it cant be dependent on any other classes
public  class InnerClass {

    ///  only static to Outerclass ..can be instantiated to any other internal class
    static class Test{
         String name;
         public Test(String name){
             this.name=name;
         }

         @Override
         public String toString(){
             return name;
         }
    }

    public static void main(String[] args) {
        Test a=new Test("Devid");
        Test b=new Test("rahul");

        System.out.println(a);/// will call toString method of its own if present in class or
        // will call its own toString method and return a hashcode.
        System.out.println(b.name);
    }

}

//static class A{
//
//}
