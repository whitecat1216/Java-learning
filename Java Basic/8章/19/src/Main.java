public class Main {
    public static void main(String[] args) throws Exception {
        String str = "null";

        if(str==null){
            System.out.println("null");
        }else if(str.length()==0){
            System.out.println(0);
        }else{
            System.out.println("other");
        }
    }
}
