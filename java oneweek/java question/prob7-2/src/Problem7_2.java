public class Problem7_2 {
    public static void main(String srgs[]){
        // TwoStringsクラスのインスタンスを作成
        TwoStrings s = new TwoStrings();

        // 文字列を設定
        s.setString1("Hello");  // セッターを使って文字列を設定
        s.setString2("World");  // セッターを使って文字列を設定

        // 結果を表示
        System.out.println("一つ目の文字列は" + s.getString1());
        System.out.println("二つ目の文字列は" + s.getString2());
        System.out.println("二つの文字列を合成したものは" + s.getConnectedString());
    }
}
