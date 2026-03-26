public class Manager extends Employee{
    public void disp(){
        System.out.println("Manager");
    }

    public static void main(String[] args){
        Manager m=new Manager();
        Employee e=m;
        e.disp();
    }


}