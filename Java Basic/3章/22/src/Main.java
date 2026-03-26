public class Main {
    public static void main(String[] args) throws Exception {
        String name="cd";
        switch(name){
            case "book":
                System.out.println("本");
                break;
            case "game":
                System.out.println("ゲーム");
                break;
            default:
                System.out.println("その他");
        }
    }
}
