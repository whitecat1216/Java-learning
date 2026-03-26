public class RectanglePrinter {
    //四角形を表示するメソッド
    public static void printRectangle(int vertical,int horizontal){
        //縦と横のサイズに基づいて、四角形を表示
        for(int i=0; i<vertical; i++){
            for(int j=0; j<horizontal; j++){
                System.out.print("□");
            }
            System.out.println();//行の終わりで改行
        }
    }
}
