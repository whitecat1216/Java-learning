

public class Sample601 {
    

    public static void main(String[] args){
        SampleClass01 s=new SampleClass01();//インスタンスの生成
        s.n=100; //フィールドnに値を入力
        s.s="Hello"; //フィールドsに値を入力
        int ans=s.add(1,2);
        String str=s.add("World");
        System.out.println(ans);
        System.out.println(str);
        s.showNum();
    }
}
