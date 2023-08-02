package cn.kgc.mapper;

import cn.kgc.entity.BookCategoryCount;

import java.util.List;

public interface BookCategoryCountMapper {

    List<BookCategoryCount> countBooksPerCategory();

}
