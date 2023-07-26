package cn.kgc.mapper;

import cn.kgc.entity.Book;
import org.apache.ibatis.annotations.*;

import java.security.PublicKey;
import java.util.List;

public interface BookMapper {

    //查询
    @Select("select * from book")
    public List<Book> findAlLBook();

    //通过id查询,指定参数!!!!单个参数
    @Select("select * from book where bookId=#{bookId}")
    public Book getBookById(@Param("bookId") Integer bookId);

    //增加
    @Insert("Insert into book(bookName,bookPrice,bookTitle,bookDesc)" +
            " values(#{bookName},#{bookPrice}, #{bookTitle} ,#{bookDesc})")
    public Integer addBook(Book book);

    //删除
    @Delete("DELETE from book where bookId=#{bookId}")
    public Integer delBookById(@Param("bookId") Integer bookId);

    //修改
    @Update("UPDATE book SET bookName = #{bookName}, bookPrice =#{bookPrice} WHERE bookId = #{bookId}")
    public Integer updateBook(Book book);
}
