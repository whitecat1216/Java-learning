public class App {
    public static void main(String[] args)  {
        int i,num;
        num=1;
        // whileループで実行
        System.out.print("while文で実行");
        i=1;
        while (i<num) {
            System.out.print("*");
            i++;
        }
        System.out.println();
        //do=while文で実行
        System.out.print("do~while文で実行");
        i=1;
        do{
            System.out.print("*");
            i++;
        }while(i<num);
    }
}
