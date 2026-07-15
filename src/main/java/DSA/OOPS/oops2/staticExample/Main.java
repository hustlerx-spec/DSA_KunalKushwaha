package DSA.OOPS.oops2.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human Devid=new Human (21,"Devid",50000,false);
//        Human rahul=new Human (23,"Rahul",45000,true);
//
//
////        System.out.println(rahul.name);
//
//        System.out.println(Devid.population);
//        System.out.println(rahul.population);

      Main fun=new Main();
      fun.fun2();
    }
    static void fun() {
//        greeting();
          // we cant use this bcoz it requires an instance
        //but the function you are using it im doesnt depend on instances.


//          we cannot access non static stuff without referencing instances
//        in static context
        // hence, here I am referencing it.
        Main m = new Main();
        m.greeting();
    }
    void fun2() {
        greeting();     // this works because , fun2 will be called from some where
//                        in the ain so its object will be created, this object will be usedby greeting as well
    }
    void greeting(){
        fun();
        System.out.println("Hello World");
    }
}
