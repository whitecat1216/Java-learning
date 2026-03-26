public class problemex3 {
    public static void main(String[] args)  {
        // 乱数を生成
        int[] sizes=RandomNumberGenerator.generateRandomNumbers();
        int vertical=sizes[0];
        int horizontal=sizes[1];

        //結果を表示
        System.out.println("たて:"+vertical);//発生した乱数(縦)
        System.out.println("よこ:"+horizontal);//発生した乱数(横)

        //四角形を表示
        RectanglePrinter.printRectangle(vertical,horizontal);
    
    }
}
