import cn.kgc.entity.Book;
import cn.kgc.entity.BookCategory;
import cn.kgc.entity.BookCategoryCount;
import cn.kgc.entity.Library;
import cn.kgc.mapper.BookCategoryCountMapper;
import cn.kgc.mapper.BookCategoryMapper;
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
import java.util.*;

public class MyBatisTest {
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

    //    @After
//    public void teardown() {
//        sqlSession.close();
//    }
    @Test
    // 作业题目4：根据书本id查询图书馆信息、书本类别信息和书本信息
    public void testQueryBookDetailsById() {
        int bookId = 4;
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);
        Book book = bookMapper.getBookDetailsById(bookId);
        System.out.print("Book Details:\t");
        System.out.print("Book ID: " + book.getBookId() + "\t");
        System.out.print("Book Name: " + book.getBookName() + "\t");
        System.out.print("Price: " + book.getPrice() + "\t");
        System.out.print("Description: " + book.getDescription() + "\t");

        BookCategory category = book.getCategory();
        System.out.print("\tCategory ID: " + category.getCategoryId() + "\t");
        System.out.print("Category Name: " + category.getCategoryName() + "\t");

        Library library = category.getLibrary();
        System.out.print("\tLibrary ID: " + library.getLibraryId() + "\t");
        System.out.print("Library Name: " + library.getName() + "\t");
        System.out.print("Library Address: " + library.getAddress() + "\t");
        System.out.print("Library Phone: " + library.getPhone() + "\t");

    }


    @Test
    // 作业题目5：查询每种类别的书本数量
    public void testCountBooksPerCategory() {
        BookCategoryCountMapper bookCategoryCountMapper = sqlSession.getMapper(BookCategoryCountMapper.class);
        List<BookCategoryCount> booksPerCategoryCountList = bookCategoryCountMapper.countBooksPerCategory();

        // 打印查询结果
        for (BookCategoryCount bookCategoryCount : booksPerCategoryCountList) {
            String libraryName = bookCategoryCount.getLibraryName();
            String categoryName = bookCategoryCount.getCategoryName();
            int bookCount = bookCategoryCount.getBookCount();

            System.out.println("Library Name: " + libraryName + ", Category Name: " + categoryName + ", Book Count: " + bookCount);
        }


    }

    @Test
    // 作业题目6：批量新增书本信息
    public void testBatchInsertBooks() {
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);

        List<Book> books = new ArrayList<Book>();
        books.add(new Book("新书1", 25.99, "这是新书1的描述", 1, null));
        books.add(new Book("新书2", 19.99, "这是新书2的描述", 1, null));
        books.add(new Book("新书3", 35.99, "这是新书3的描述", 2, null));

        bookMapper.batchInsertBooks(books);
        sqlSession.commit();
    }

    @Test
    // 作业题目7：批量删除id为7, 9, 10的书本信息
    public void testBatchDeleteBooks() {
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);

        List<Integer> bookIds = Arrays.asList(10, 11, 12);

        bookMapper.batchDeleteBooks(bookIds);
        sqlSession.commit();
    }

    @Test
    // 作业题目8：查询书本价格在30-90之间的书本信息以及书本类别名称，使用动态SQL完成
    public void testDynamicSQLForBooksWithinPriceRange() {
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);

        double minPrice = 30.0;
        double maxPrice = 90.0;

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("minPrice", 30.0);
        map.put("maxPrice", 90.0);

        List<Book> booksByPriceRange = bookMapper.getBooksByPriceRange(map);

        // 打印查询结果
        for (Book books : booksByPriceRange) {
            System.out.print("Category Name: " + books.getCategory().getCategoryName() + "\t");

            System.out.println("Book Name: " + books.getBookName() + ", Price: " + books.getPrice());
        }
    }

    @Test
    // 作业题目9：动态SQL完成，查询书本描述中包含‘sql’的书本信息
    public void testDynamicSQLForBooksContainingSQL() {
        BookMapper bookMapper = sqlSession.getMapper(BookMapper.class);

        String keyword = "sql";

        List<Book> booksByDescription = bookMapper.getDescription(keyword);

        // 打印查询结果
        for (Book book : booksByDescription) {
            System.out.println("Book Name: " + book.getBookName() + ", Description: " + book.getDescription());
        }


    }


}
