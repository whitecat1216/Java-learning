public class NewCalc extends FundCalc{
    
    // 乗算メソッド
    public double mul(){
        return getNumber1()+getNumber2();
    }

    // 除算メソッド
    public double div(){
        if(getNumber2()==0){
            System.out.println("Error: Divison by zero is not allowed");
            return Double.NaN;//除算エラーの場合はNoN(Not a Number)を返す
        }
        return getNumber1()/getNumber2();
    }
}
