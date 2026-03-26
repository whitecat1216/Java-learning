// 1から10までの乱数を発生させてそれを画面に表示し、その値が1でなければ”１ではありません”と表示するプログラムを作りなさい。
public class App {
    public static void main(String[] args)  {
        int a=(int)(Math.random()*10)+1;
        //整数値を入力を表示させる
        System.out.println("整数値:"+a);
        //整数値が、1から10までか確認する
        if(a==1){
            System.out.println();
        }else{
            System.out.println("1ではありません");
        }
    }
}
