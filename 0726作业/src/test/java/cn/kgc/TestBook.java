package cn.kgc;

import cn.kgc.entity.Book;
import cn.kgc.mapper.BookMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class TestBook {


    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;

    @Before
    //提前加载sql对象
    public void setup() {
        try {
            InputStream input = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
            sqlSession = sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public void teardown() {
        sqlSession.close();
    }

    // 根据id查询书籍
    @Test
    public void testGetBookById() {
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(7);
        List<Book> listBook = sqlSession.selectList("getBookByIds", ids);
        // System.out.println(listBook);
        for (Book s : listBook) {
            System.out.println(s);

        }


    }

    // 查询所有书籍
    @Test
    public void testGetAllBooks() {
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        List<Book> books = bookMapper.findAlLBook();
        System.out.println("所有的书籍有:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // 插入一本书籍
    @Test
    public void testAddBook() {
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        Book bookIns = new Book(1, "hhh", 50, "zzz", "ggg");
        int row = bookMapper.addBook(bookIns);
        sqlSession.commit();
        System.out.println("插入的数目: " + row);
    }

    // 根据一组书籍
    @Test
    public void testDelBooksById() {
        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(9);
        ids.add(10);
        ids.add(11);
        int row = sqlSession.delete("batchDelBooks", ids);
        sqlSession.commit();
        System.out.println("删除的数目是:" + row);


    }

    // 删除一组书籍
    @Test
    public void testDeleteBooksById() {
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        int row = bookMapper.delBookById(6);
        sqlSession.commit();
        System.out.println("删除数据影响的行数：" + row);
    }

    //修改一本书
    @Test
    public void testUpdate() {
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        Book bookup = new Book(7, "新的名字", 50, "zzz", "ggg");

        int row = bookMapper.updateBook(bookup);
        sqlSession.commit();
        System.out.println("更新行数" + row);


    }

    // 插入一组书籍
    @Test
    public void testAddBooks() {
        //BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);

        Book bookIns = new Book(97, "hhh", 50, "zzz", "ggg");
        Book bookIns2 = new Book(98, "hhh", 50, "zzz", "ggg");
        Book bookIns3 = new Book(99, "hhh", 50, "zzz", "ggg");
        List<Book> ids = new ArrayList<Book>();
        ids.add(bookIns);
        ids.add(bookIns2);
        ids.add(bookIns3);


        int row = sqlSession.insert("batchInsertBooks", ids);
        sqlSession.commit();
        System.out.println("插入的数目: " + row);
    }

}
