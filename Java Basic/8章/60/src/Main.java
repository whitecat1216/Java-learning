public class Main {
    public static void main(String[] args) throws Exception {
        String s1="abc";
        String s2="abc";
        String s3=new String("abc");

        if(s1==s2){
            System.out.println("s1==s2");
        }else{
            System.out.println("s1!=s2");
        }
        if(s1==s3){
            System.out.println("s1==s3");
        }else{
            System.out.println("s1!=s3");
        }
    }
}
