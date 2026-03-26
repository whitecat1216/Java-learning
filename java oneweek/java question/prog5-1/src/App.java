import java.util.Random;

public class App {
    public static void main(String[] args)  {
        //配列の大きさ7の整数型配列を作成
        int[] a=new int[7];

        //Randomクラスを使って乱数を生成
        Random random=new Random();

        //配列に1から10までの乱数を代入
        for(int i=0; i<a.length; i++){
            a[i]=random.nextInt(10)+1; //1=10の乱数を生成
        }

        //配列の内容を表示
        for(int i=0; i<a.length; i++){
            System.out.println("a[" + i +"]="+a[i]+"");
        }
    }
}
