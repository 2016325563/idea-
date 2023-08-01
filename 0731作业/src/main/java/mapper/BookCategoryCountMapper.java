package mapper;

import entity.BookCategoryCount;

import java.util.List;

public interface BookCategoryCountMapper {

    List<BookCategoryCount> countBooksPerCategory();

}
