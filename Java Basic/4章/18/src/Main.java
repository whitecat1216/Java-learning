public class Main {
    public static void main(String[] args) throws Exception {
        for (int i=0; i<2; i++){
            for (int j=0; j<2; j+=i){
                System.out.println("LOOP");
            }
        }
    }
}
