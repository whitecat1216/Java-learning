public class Problemex1_1 {
    public static void main(String[] args)  {
        int a=(int)(Math.random()*10)+1;//1~10の乱数を発生
        int b=(int)(Math.random()*10)+1;//1~10の乱数を発生
        int result1=add(a,b);
        int result2=sub(a,b);
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println(a+" + "+b+" = "+result1);
        System.out.println(a+" - "+b+" = "+result2);
    }
    //足し算
    static int add(int a, int b){
        return a+b;
    }

    //引き算
    static int sub(int a, int b){
        return a-b;
    }
}
