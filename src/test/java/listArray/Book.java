package listArray;

import java.math.BigDecimal;

class Book {
	private String title;
    private String author;
    private String publisher;
    private BigDecimal bookPrice;
 
    public Book(String title,
                String author,
                String publisher,
                BigDecimal bookPrice) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.bookPrice = bookPrice;
    }
 
    public String getTitle() {
        return title;
    }
 
    public String getAuthor() {
        return author;
    }
 
    public String getPublisher() {
        return publisher;
    }
 
    public Long getBookPrice() {
        return Long.valueOf(String.valueOf(bookPrice));
    }
 
    @Override
    public String toString() {
        return " \n Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", bookPrice=" + bookPrice +
                '}';
    }
}
