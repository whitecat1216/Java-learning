public class Main {
    public static void main(String[] args) {
        double b = 1.5;
        int x = (int)(b * 10);  // 15

        switch (x) {
            case 10:
                System.out.println("A");
                break;
            case 15:
                System.out.println("B");
                break;
            case 20:
                System.out.println("C");
                break;
        }
    }
}
