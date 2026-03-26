public abstract class Airplane {
    //飛行機のタイプ(サブクラスで設定)
    protected String type;

    //タイプの取得
    public String getType(){
        return type;
    }

    //飛行する
    public abstract void fly();
}
