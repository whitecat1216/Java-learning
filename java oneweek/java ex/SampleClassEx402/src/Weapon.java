public abstract class Weapon {
    private String name="";
    //コンストラクタ
    public Weapon(String name){
        //武器の名前を設定
        this.name=name;
    }
    //武器の名前を取得
    public String getName(){
        return this.name;
    }

    //武器メソッド
    public abstract void attack();
}
