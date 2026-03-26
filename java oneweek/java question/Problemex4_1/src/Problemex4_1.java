public class Problemex4_1 {
    public static void main(String[] args)  {
        //TODO自動生成されたメソッド・スタブ
        CellPhone cp=new CellPhone();
        funcPhone(cp);
        funcMailer(cp);
        funcComputer(cp);
    }
    //電話としての処理
    public static void funcPhone(IPhone phone){
        phone.callPhone(); //電話をかける
        phone.receivePhone(); //電話を受ける
    }
    //メーラをしての処理
    public static void funcMailer(IMailer mailer){
        mailer.sendMail(); //メールを送信する
        mailer.receiveMail();//メールを受信する
    }
    //コンピュータとしての処理
    public static void funcComputer(IComputer computer){
        computer.playGame(); //ゲームをする
        computer.borwseWeb(); //ウェブを開始する
    }
}
