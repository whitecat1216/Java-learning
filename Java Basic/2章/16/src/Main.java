public class Main {
    public static void main(String[] args) throws Exception {
        int a = 3;
        int total = 0;   // ← 外で宣言

        for(int i = 0; i < 10; i++){
            total += 5;
        }

        System.out.println(total);
    }
}
