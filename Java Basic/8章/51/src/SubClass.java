public class SubClass  extends SuperClass {
    String val="sub";

    public void test(){
        System.out.println(val+","+super.val);
    }
    
    public static void main(String[] args) {
        SubClass subClass=new SubClass();
        subClass.test();
    }
}
