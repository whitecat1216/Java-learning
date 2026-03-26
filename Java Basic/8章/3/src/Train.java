public class Train {
    static String name="none";

    public Train(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Train t1=new Train();
        Train t2=new Train("aline");
        System.out.println(t1.name+""+t2.name);
    }
}
//定義されていないコンストラクタを呼び出しているため、コンパイルエラーが発生します。Trainクラスには引数なしのコンストラクタが定義されていないため、Train t1=new Train();の行でエラーになります。引数なしのコンストラクタを追加するか、t1を作成する際に引数を渡す必要があります。    