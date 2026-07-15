package DSA.OOPS.oops2;

public class Main2 {
    public static void main(String[] args) {
        Singleton obj=Singleton.getInstance();

        Singleton obj1=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();

//        all 3 ref var are pointing to same object
    }
}
