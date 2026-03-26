public class Main {
    public static void main(String[] args) throws Exception {
        Sample[] samples = {new A (),new B()};
        for (Sample s: samples) {
            s.test();
        }
    }
}
