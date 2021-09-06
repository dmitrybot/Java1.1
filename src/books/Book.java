package books;

public class Book {
    private String name;
    private Integer pages;

    public Book(String name, Integer pages){
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String toString(){
        return "Book's name is " + name + " and it has " + pages + " pages";
    }
}
