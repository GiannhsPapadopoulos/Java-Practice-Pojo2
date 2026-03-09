

public class Main {

    public static void main(String[] args) {

        Book b1 = new Book("Love yourself", "Nick P", 15.99);
        System.out.println(b1);
        b1.setPrice(35.99);
        b1.setTitle("Bad Habits");
        System.out.println(b1.toString());


    }
}