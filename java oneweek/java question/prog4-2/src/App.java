import java.util.Random;
public class App {
    public static void main(String[] args)  {
        //1から10までの乱数を生成
        Random random=new Random();
        int num=random.nextInt(10)+1;//1~10の乱数を生成

        //生成した乱数を表示
        System.out.println("生成された乱数:"+num);

        //その数だけ「□]を表示(while文を使用)
        int i=0;
        while(i<num){
            System.out.println("□");
            i++;
        }
    }
}
