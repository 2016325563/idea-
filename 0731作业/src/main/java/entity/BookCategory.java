package cn.kgc.entity;

import java.util.List;

public class BookCategory {

    private Integer categoryId;
    private String categoryName;
    private Integer libraryId;
    Library library;
    Book book;

    public BookCategory() {
    }

    public BookCategory(Integer categoryId, String categoryName, Integer libraryId) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.libraryId = libraryId;

    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }


    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }
}
