/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB1;
import java.time.LocalDate;
import javax.swing.JOptionPane;
/**
 *
 * @author harsh
 */
public class Book {
    private int book_isbn;
    private String book_name;
    private String book_author;
    private int book_price;
    private int number_of_copies;
    
    public Book() {
        System.out.println("New book created"); //test if it works
    }
    
public void setBookIsbn(int isbn) {
    book_isbn = isbn;
}
public void setBookName(String name) {
    book_name = name;
}
public void setBookAuthor(String author) {
    book_author = author;
}
public void setBookPrice(int price) {
    book_price = price;
}
public void setBookCopies(int copies) {
    number_of_copies = copies;
}

public int getBookIsbn() {
    return book_isbn;
}
public String getBookName() {
    return book_name;
}
public String getBookAuthor() {
    return book_author;
}
public int getBookPrice() {
    return book_price;
}
public int getBookCopies() {
    return number_of_copies;
}  

public void reserve_book(String bookName, LocalDate date) {
    bookName = JOptionPane.showInputDialog("Insert book name to reserve");
    boolean available = false;
    String output;
    
    if (number_of_copies > 0 && bookName.equals(book_name)) {
        available = true;
    }
    if (available == true) {
        output = "Reservation has been confirmed on date " + date;           
    } else {
        output = "Not available, please try again later...";
    }
    JOptionPane.showMessageDialog(null, output);
}

public void borrow_book(String bookName) {
    bookName = JOptionPane.showInputDialog("Insert book name to book");
    boolean available = false;
    String output;
    if (number_of_copies > 0 && bookName.equals(book_name) ) {
        available = true;
    }
    if (available == true) {
        output = "Book has been borrowed successfully";           
    } else {
        output = "Not available, please try again later...";
    }
    JOptionPane.showMessageDialog(null, output);
}

}
