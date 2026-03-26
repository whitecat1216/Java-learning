public class Counter {

    static int count = 0;

    Counter() {
        count++;
    }

    public static void main(String[] args) throws Exception {
        Counter c =new Counter();
        c=new Counter();
        System.out.println(c.count);
    }
}
