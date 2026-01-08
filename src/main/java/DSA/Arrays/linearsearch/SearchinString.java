package DSA.Arrays.linearsearch;

public class SearchinString {
    public static void main(String[] args) {
        String name="Devid";
        char ch='d';
        System.out.println(search2(name,ch));
    }

    static int search2(String name, char ch){
        if(name.length()==0){
            return -1;
        }
        for(int i=0;i<name.length();i++){
            char val=name.charAt(i);
            if(val==ch) {
                return i;
            }
        }
        return -1;
    }



//    static boolean search(String name, char ch){
//        if(name.length()==0){
//            return false;
//        }
//        for(char val:name.toCharArray()){
//            if(val==ch) {
//                return true;
//            }
//        }
//        return false;
//    }

}
