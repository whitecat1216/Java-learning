public class  Problemex3_2{
    public static void main(String[] args)  {
        Computer[] cp=new Computer[3];
        cp[0]=new PersonalComputer();
        cp[1]=new TabletPC();
        cp[2]=new SmartPhone();
        for(Computer c:cp){
            c.showType();
            c.input();
            c.output();
            c.communication();
            System.out.println("--------------------------------------");
        }
    }
}
