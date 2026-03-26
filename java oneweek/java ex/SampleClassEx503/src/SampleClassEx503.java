import java.lang.reflect.Array;
import java.util.ArrayList;

public class SampleClassEx503 {
    public static void main(String[] args)  {
        //String型でデータ追加
        ArrayList<String> sl=new ArrayList<String>();
        sl.add("ONE");
        sl.add("TWO");
        sl.add("THREE");
        //特殊for文で結果を出力
        for(String s:sl){
            System.out.print(s+" ");
        }
        System.out.println();//改行
        //Integer型でデータ追加
        ArrayList<Integer> il=new ArrayList<Integer>();
        il.add(1);
        il.add(2);
        il.add(3);
        for(Integer i: il){
            System.out.println((i+" "));
        }
        System.out.println();
    }
}
