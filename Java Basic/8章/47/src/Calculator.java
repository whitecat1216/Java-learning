public class Calculator {

    int beforeTaxes(int price){
        return (int)(price*1.08);
    }

    double beforeTaxes(double price){
        return price*1.08;
    }
    public static void main(String[] args) throws Exception {
       int p=40;
       Calculator calc=new Calculator();
       System.out.println("payment="+calc.beforeTaxes(p));
    }
}
