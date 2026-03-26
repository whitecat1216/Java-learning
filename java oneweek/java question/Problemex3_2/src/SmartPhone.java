public class SmartPhone extends Computer{
    //コンストラクタ
    public SmartPhone(){
        super("スマートフォン");
    }
    //入力処理
    public void input(){
        System.out.println("タッチパネルディスプレイをタップして操作");
    }
    //出力装置
    public void output(){
        System.out.println("タッチパネルディスプレイに出力");
    }
}