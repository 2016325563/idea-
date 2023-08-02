package cn.kgc.mapper;

import cn.kgc.entity.Book;
import cn.kgc.entity.Library;

import java.util.List;

public interface BookCategoryMapper {
    // 查询每种类别的书本数量

    // 多对多关联查询：根据图书类别id查询该类别下的所有书本信息
    List<Book> queryBooksByCategoryId(int categoryId);

}
