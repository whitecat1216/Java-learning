public abstract class Computer {
    //コンピュータのタイプ
    private String type;
    //コンストラクタ
    public Computer(String type){
        this.type=type;
    }
    //入力装置
    public abstract void input();
    //出力装置
    public abstract void output(); 
    //通信処理
    public void communication(){
        System.out.println("インターネットで通信");
    }

    //タイプの出力
    public void showType(){
        System.out.println("コンピュータの種類:"+ type);
    }
}
