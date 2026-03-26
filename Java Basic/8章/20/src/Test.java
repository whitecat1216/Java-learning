public class Test {

    private static int a;
    private int b;

    public static int countUpA(){
        return ++a;
    }

    public int doMethod(){
        return countUpA();
    }
    public static void main(String[] args) throws Exception {
        Test test=new Test();
        System.out.println(test.doMethod());
        System.out.println(" " +test.countUpA());
    }
}
