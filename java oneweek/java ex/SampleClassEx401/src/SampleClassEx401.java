public class SampleClassEx401 {
    public static void main(String[] args) {
        //携帯クラスのインスタンス生成
        CellPhone cp=new CellPhone("hoge@email.com","090-1234-5678");
        //携帯クラスで、電話とメールを送る
        cp.call("011-123-4567");
        cp.sendMail("fuge@email.com");
        //電話インターフェースでインスタンスにアクセス
        IPhone phone=(IPhone)cp;
        phone.call("011-987-6543"); //電話をかける
        // phone.sendMail("foo@email.com"); //メールの送信メソッドは利用できない
        //メールインターフェースでインスタンスにアクセス
        IEmail mail=(IEmail)cp;
        mail.sendMail("bar@email.com"); //メールを出す
        //mail.call("011-222-3333")
    }
}
