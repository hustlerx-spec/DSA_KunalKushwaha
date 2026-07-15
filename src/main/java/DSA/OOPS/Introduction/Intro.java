package DSA.OOPS.Introduction;

import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {

        // data of 5 students :{roll no,name,marks}
        int[] rno=new int[5];
        String[] name=new String[5];
        float[] marks=new float[5];

        Student[] students=new Student[5];

//        Student Kunal;   //just declaring
//        System.out.println(Kunal.rno);
//        System.out.println(Arrays.toString(students));

//        Student Kunal=new Student();

        Student Kunal=new Student(13,"Devid Deshmukh",85.4f);

//        Kunal.rno=14;
//        Kunal.name="Kunal ";
//        Kunal.marks=88.5f;      // if ypu do it here, it will modify the values inside constructor.

//        System.out.println(Kunal.rno);
//        System.out.println(Kunal.name);
//        System.out.println(Kunal.marks);
//        Kunal.changename("dog lover");
//        Kunal.greeting();

        System.out.println(Kunal.rno);
        System.out.println(Kunal.name);
        System.out.println(Kunal.marks);

        Student random=new Student(Kunal);

        Student random2=new Student();

        System.out.println(random2.rno);

        System.out.println(random2.name);
        System.out.println(random2.marks);

        Student random3=new Student();
        Student random4=random3;

        random3.name="ashwini lawhale";

        System.out.println(random4.name);



    }
}
// create a class
//for every single element
class Student{
    int rno;
    String name;
    float marks;

    void greeting() {
        System.out.println("Hello! My name is "+name);
    }

    void changename(String newname) {
        name=newname;
    }


//    Student() {
//        rno=13;    // can do without using this, but using this is a good convention.
//        this.name="Kunal Kushwaha";
//        this.marks=88.5f;
//    }


     Student(Student other){
        this.rno=other.rno;
        this.name=other.name;
        this.marks=other.marks;
     }

     Student (){
//        this is how you call a constructor from another constructor
//         internally: new Student(13,"default person",100.0f);
        this(17,"default person",100.0f);
     }

    Student(int rno, String name, float marks) {
        this.rno=rno;
        this.name=name;
        this.marks=marks;

//        Kunal.rno=13;
//        Kunal.name="Kunal Kushwaha";
//        Kunal.marks=88.5f;


        // we need a way to add the values of the above
        // properties,object by object.

        // we need one word to access every object.


        // "this" keyword

//        this.rno=13;
//        this.name="Kunal Kushwaha";
//        this.marks=88.5f;
    }

}
