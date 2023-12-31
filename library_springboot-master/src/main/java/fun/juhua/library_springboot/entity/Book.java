package fun.juhua.library_springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import fun.juhua.library_springboot.utils.DateUtils;
import java.util.Date;

/**
 * @description: 书籍实体类
 **/
public class Book {

    /*
      @TableId注解是专门用在主键上的注解，如果数据库中的主键字段名和实体中的属性名，不一样且不是驼峰之类的对应关系，
      可以在实体中表示主键的属性上加@Tableid注解，并指定@Tableid注解的value属性值为表中主键的字段名既可以对应上。
    * value映射主键字段的名字
      type 设置主键类型、主键的生成策略
      开发者手动赋值 INPUT
    * */
    //书籍ID
    @TableId(type = IdType.INPUT)
    private String bookID;
    //书名
    private String bookName;
    //书籍作者
    private String bookAuthor;
    //出版社
    private String bookPublisher;
    //出版日期
    private Date publishTime;
    //单价
    private float bookPrice;
    //总数
    private int bookSum;
    //借出数量
    private int bookLend;
    //书籍类型
    private String tag;
    //ISBN编号   国际标准书号
    private String isbn;

    //有参构造方法 Date类型的 publishTime 时间
    public Book(String bookID, String bookName, String bookAuthor, String bookPublisher, Date publishTime, float bookPrice, int bookSum, int bookLend, String tag, String isbn) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;
        this.publishTime = publishTime;
        this.bookPrice = bookPrice;
        this.bookSum = bookSum;
        this.bookLend = bookLend;
        this.tag = tag;
        this.isbn = isbn;
    }

    //有参构造方法 String类型的 publishTime 时间
    public Book(String bookID, String bookName, String bookAuthor, String bookPublisher, String publishTime, String bookPrice, String bookSum, String bookLend, String tag, String isbn) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;
       // System.out.println("Book -> Book(57): " + publishTime);
        this.publishTime = new DateUtils().toDate(publishTime);
        this.bookPrice = Float.parseFloat(bookPrice);
        this.bookSum = Integer.parseInt(bookSum);
        this.bookLend = Integer.parseInt(bookLend);
        this.tag = tag;
        this.isbn = isbn;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID='" + bookID + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPublisher='" + bookPublisher + '\'' +
                ", publishTime=" + publishTime +
                ", bookPrice=" + bookPrice +
                ", bookSum=" + bookSum +
                ", bookLend=" + bookLend +
                ", tag='" + tag + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getBookSum() {
        return bookSum;
    }

    public void setBookSum(int bookSum) {
        this.bookSum = bookSum;
    }

    public int getBookLend() {
        return bookLend;
    }

    public void setBookLend(int bookLend) {
        this.bookLend = bookLend;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
