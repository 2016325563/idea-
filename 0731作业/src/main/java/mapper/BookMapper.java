package mapper;

import entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BookMapper {

    // 根据书本id查询图书馆信息、书本类别信息和书本信息
    Book getBookDetailsById(int bookId);

    // 批量新增书本信息
    void batchInsertBooks(List<Book> bookList);

    // 批量删除id为7, 9, 10的书本信息
    void batchDeleteBooks(List<Integer> bookIds);

    // 查询书本价格在30-90之间的书本信息以及书本类别名称，使用动态SQL完成
    List<Book> getBooksByPriceRange(@Param("map") Map<String, Object> map);

    // 动态SQL完成，查询书本描述中包含‘sql’的书本信息

    List<Book> getDescription(@Param("keyword") String keyword);

}
