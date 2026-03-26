public class Main {
    public static void main(String[] args) throws Exception {
        for(int i=0;;i++) {
            int j=0;
            while(j<=3){
                System.out.println(j++);
            }
        }
    }
}
//for文に条件が記入さrていないため、無限ループになります。内側のwhile文も同様に、jが3以下の間はループし続けます。結果として、0から3までの数字が無限に出力されます。 S