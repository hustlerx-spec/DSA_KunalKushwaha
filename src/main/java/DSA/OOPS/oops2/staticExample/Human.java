package DSA.OOPS.oops2.staticExample;

public class Human {
   int age;
   String name;
   int salary;
   boolean married;
   static long population;

   static void message(){
//       System.out.println("Hello World");
//       System.out.println(this.age);   // cant use this keyword inside static method
//                                         bcoz this is dependent on object and static is not.
   }

   public Human(int age, String name, int salary, boolean married) {
       this.age = age;
       this.name = name;
       this.salary = salary;
       this.married = married;
//       this.population +=1;
        Human.population+=1;
        // works with both, but convention is to update static variables via className.

      message();
   }
}
