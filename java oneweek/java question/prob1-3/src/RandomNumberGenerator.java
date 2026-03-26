import java.util.Random;

public class RandomNumberGenerator {
    

    //1から10の範囲で乱数を2つ生成して返すメソッド
    public static int[] generateRandomNumbers(){
        Random rand=new Random();
        int vertical=rand.nextInt(10)+1;//1から10の乱数
        int horizontal=rand.nextInt(10)+1;//1から10の乱数
        return new int[]{vertical,horizontal};//配列を返す
    }
}
