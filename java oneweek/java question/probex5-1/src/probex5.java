import java.util.ArrayList;
import java.util.Random;

public class probex5 {
    public static void main(String[] args)  {
        Random rand=new Random(); //乱数生成のためのインスタンス
        ArrayList<Integer> evenNumbers=new ArrayList<>(); //偶数用のArrayList
        ArrayList<Integer> oddNumbers=new ArrayList<>(); //奇数用のArrayList

        while(true){
            int num=rand.nextInt(11); //0~10の乱数を発生
            System.out.println("0~10の値を出力:"+num);

            //乱数が0なら終了
            if(num==0){
                break;
            }

            // 奇数か偶数かを判断して対応するリストに追加
            if(num%2==0){
                evenNumbers.add(num);
            }else{
                oddNumbers.add(num);
            }
        }

        //結果を出力
        System.out.print("偶数 :");
        for(int even :evenNumbers){
            System.out.println(even+" ");
        }
        System.out.println();

        System.out.println("奇数 :");
        for(int odd:oddNumbers){
            System.out.print(odd+" ");
        }
        System.out.println();
    }
}
