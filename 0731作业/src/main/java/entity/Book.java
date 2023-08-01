package entity;

import java.util.List;

public class Book {
    private Integer bookId;
    private String bookName;
    private Double price;
    private String description;
    private Integer categoryId;
    BookCategory category;

    public Book() {
    }

    public Book(String bookName, Double price, String description, Integer categoryId, BookCategory category) {
        this.bookName = bookName;
        this.price = price;
        this.description = description;
        this.categoryId = categoryId;
        this.category = category;
    }

    public Book(Integer bookId, String bookName, Double price, String description, Integer categoryId,
                Integer libraryId, String categoryName, Integer bookCategoryId) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.description = description;
        this.categoryId = categoryId;
        // 初始化其他属性
    }


    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public BookCategory getCategory() {
        return category;
    }

    public void setCategory(BookCategory category) {
        this.category = category;
    }
}
