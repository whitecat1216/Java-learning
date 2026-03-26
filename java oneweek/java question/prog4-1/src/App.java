import java.util.Random;

public class App {
    public static void main(String[] args)  {
        //1から10までの乱数を生成
        Random random=new Random();
        int num=random.nextInt(10)+1;

        //生成した乱数を表示
        System.out.println("数"+num);

        //その数だけ「□」を表示
        for (int i=0; i<num; i++){
            System.out.print(" □ ");
        }

        }
        
        
    }

