public class Calculation {
    private int number1; //一つ目の数
    private int number2;//二つ目の数

    //number1のセッター
    public void setNumber1(int number1){
        this.number1=number1;
    }

    //number2のセッター
    public void setNumber2(int number2){
        this.number2=number2;
    }

    //number1のゲッター
    public int getNumber1(){
        return number1;
    }

    //number2のセッター
    public int getNumber2(){
        return number2;
    }

    //二つの数の和を計算
    public int add(){
        return number1+number2;
    }
    //二つの数の差を計算
    public int sub(){
        return number1-number2;
    }
    }

