public class SampleClass02 {
    //コンストラクタ
    public SampleClass02(){
        System.out.println("コンストラクタ");
    }
    //privateメソッド
    private void method1(){
        System.out.println("method1(private)");
    }
    //publicメソッド
    public void method2(){
        System.out.println("method2(pulic)");
    }

    //publicメソッド
    public void method3(){
        //privateメソッドの呼び出し
        method1();
        System.err.println("method3(public):num="+this.num);
    }
    //privateメソッド
    private int num=1;
}
