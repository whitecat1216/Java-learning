public class News {

    static int id;
    String name;

    void printInfo() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        News n = new News();
        n.name = "ABC";
        News.id = 1;
        n.printInfo();
    }
}
