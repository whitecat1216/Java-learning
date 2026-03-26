

public class SubClass extends SuperClass {
    public void print(){
        System.out.println("sub");
    }

    public static void main(String[] args) {
        SuperClass s = new SuperClass();  // ← 中身は SuperClass
        SubClass s2 = (SubClass) s;       // ← ここで例外発生！
        s2.print();
    }
}
