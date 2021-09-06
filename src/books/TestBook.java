package books;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("basketballing", 2000);
        Book book2 = new Book("tennising", 500);
        Book book3 = new Book("footballing", 150);
        System.out.println(book1.getName());
        book2.setPages(200);
        System.out.println(book2);
    }
}
