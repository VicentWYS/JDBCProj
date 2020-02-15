package model;

/**
 * 图书模型
 */
public class Book {
    private int id;
    private String bookName;
    private int price;
    private String author;
    private int bookTypeId;

    public Book() {
    }

    public Book(String bookName, int price, String author, int bookTypeId) {
        this.bookName = bookName;
        this.price = price;
        this.author = author;
        this.bookTypeId = bookTypeId;
    }

    public Book(int id, String bookName, int price, String author, int bookTypeId) {
        this.id = id;
        this.bookName = bookName;
        this.price = price;
        this.author = author;
        this.bookTypeId = bookTypeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookTypeId() {
        return bookTypeId;
    }

    public void setBookTypeId(int bookTypeId) {
        this.bookTypeId = bookTypeId;
    }
}
