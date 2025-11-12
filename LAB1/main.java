/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lab1;
import java.time.LocalDate;

/**
 *
 * @author SPACE4
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student zico = new Student();
        zico.setStudentId(1);
        zico.setStudentName("Zico");

        Student jojo = new Student();
        jojo.setStudentId(2);
        jojo.setStudentName("Jojo");

        Student bobo = new Student();
        bobo.setStudentId(3);
        bobo.setStudentName("Bobo");
        
        TuitionFees fees1 = new TuitionFees();
        fees1.pay_tuition_fees(12000);

        TuitionFees fees2 = new TuitionFees();
        fees2.pay_tuition_fees(24000);

        TuitionFees fees3 = new TuitionFees();
        fees3.pay_tuition_fees(25000);
        
        Book harry = new Book();
        harry.setBookIsbn(101101);
        harry.setBookName("Harry Potter");
        harry.setBookAuthor("Percy Tomasson");
        harry.setBookPrice(125);
        harry.setBookCopies(12);

        Book marko = new Book();
        marko.setBookIsbn(102102);
        marko.setBookName("L'Etoile de Ton Marko");
        marko.setBookAuthor("Ras Babyjaby");
        marko.setBookPrice(1500);
        marko.setBookCopies(8);

        // Perform transactions
        System.out.println("=== Tuition Fees ===");
        System.out.println("Zico paid Rs 12,000. Amount due: Rs " + (25000 - 12000));
        System.out.println("Jojo paid Rs 24,000. Amount due: Rs " + (25000 - 24000));
        System.out.println("Bobo paid Rs 25,000. Amount due: Rs " + (25000 - 25000));

        System.out.println("\n=== Book Transactions ===");
        LocalDate todaysDate = LocalDate.now();
        
        harry.reserve_book("Harry Potter", todaysDate);
        marko.borrow_book("L'Etoile de Ton Marko");
        harry.borrow_book("Harry Potter");
    }

    }
    

