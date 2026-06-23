package DSA.Recursion.Pattern;

public class PT_1 {
    public static void main(String[] args) {
//       print(4);
       triangle2(3,0);
    }
    static void print(int row){
        if(row==0){
            return;
        }
        for(int col=1;col<=row;col++){
            System.out.print("* ");
        }
//        System.out.print("\n");
        System.out.println();
        print(row-1);
    }
    /// full recursion
    static void triangle(int row,int col){
        if(row==0){
            return;
        }
       if(col<row){
            System.out.print("* ");
            triangle(row,col+1);
        }else{
           System.out.println();
           triangle(row-1,0);
       }
    }
    /// / very very importtant concept... always remember
    static void triangle2(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            triangle2(row,col+1);

        }else{
            triangle2(row-1,0);
            System.out.println();

        }
    }

       // my method for normal triangle
//    static void triangle2(int row,int col,int count){
//        if(row==count){
//            return;
//        }
//        if(col<=row){
//            System.out.print("* ");
//            triangle2(row,col+1,count);
//        }else{
//            System.out.println();
//            triangle2(row+1,0,count);
//        }
//    }
}
