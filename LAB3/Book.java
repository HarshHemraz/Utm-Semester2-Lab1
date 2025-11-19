/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3;

/**
 *
 * @author harsh
 */
public class Book {
    private String bookTitle;
    private int bookISBN;
    private double bookPrice;
    private String bookAuthor;
    private int numberOfPages;
    
    public Book() {
        bookTitle = "";
        bookISBN = 0;
        bookPrice = 0.0;
        bookAuthor = "";
        numberOfPages = 0;    //default constructor
        System.out.println("Default Constructor called");
    }
    public Book(String title, int ISBN, double price, String author, int page) {
        System.out.println("Overloaded Constructor called");
        bookTitle = title;
        bookISBN = ISBN;
        bookPrice = price;
        bookAuthor = author;
        numberOfPages = page;
    }
    
    public void setBookTitle(String title) {
        bookTitle = title;   
    }
    public void setBookISBN(int ISBN) {
        bookISBN = ISBN;   
    }
    public void setBookPrice(double price) {
        bookPrice = price;   
    }
    public void setBookAuthor(String author) {
        bookAuthor = author;   
    }
    public void setNumberOfPages(int numpages) {
        numberOfPages = numpages;   
    }
    
    public String getBookTitle() {
        return bookTitle;
    }
    public int getBookISBN() {
        return bookISBN;
    }
    public double getBookPrice() {
        return bookPrice;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    
}
