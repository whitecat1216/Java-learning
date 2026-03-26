public class Main {
    public static void main(String[] args) throws Exception {
        for (int i=0; i<5; i++){
            if(i<3){
                continue;
            }
            System.out.println("LOOP");
        }
    }
}
