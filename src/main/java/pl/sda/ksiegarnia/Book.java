package pl.sda.ksiegarnia;

public class Book {

    private String name;
    private Author author;
    private Category category;

    public Book(String name, Author author, Category category){
        this.name = name;
        this.author = author;
        this.category = category;
    }

    public Book(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
