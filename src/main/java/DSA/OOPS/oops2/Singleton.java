package DSA.OOPS.oops2;

public class Singleton {
     private Singleton(){// putting privat heren wont allow you to create objects
//         bcoz this constructor cant be accessed outside this class.

     }
     private static Singleton instance;



    public static Singleton getInstance() {
//       check whether 1obj only is created or not;
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
