/*Library Book Management
•	Create a Book class with attributes: bookId, title, author, price.
•	Accept details of N books from the user and store them in an array of objects.
•	Display the details of books where price > ₹500.*/
import java.util.*;
import java.util.Arrays;

public class library {
    int bookId;
    String title;
    String author;
    float price;

    library(int bookId, String title, String author, float price){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display(){
        System.out.println(this.bookId);
        System.out.println(this.title);
        System.out.println(this.author);
        System.out.println(this.price);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of books : ");
        int n = sc.nextInt();
        library book[] = new library[n];

        for(int i = 0; i < n; i++){
            System.out.println("enter the details: ");
            System.out.println("BookId :");
            int bookId = sc.nextInt();
            sc.nextLine();

            System.out.println("author :");
            String author = sc.nextLine();

            System.out.println("title :");
            String title = sc.nextLine();

            System.out.println("price :");
            float price = sc.nextFloat();

            book[i] = new library(bookId, title, author, price);
        }

        System.out.println("books with price greater than 500");
        int found = 0;
        for(library i : book) {
            if (i.price > 500) {
                i.display();
                found = 1;
            }
        }
        if(found == 0){
            System.out.println("book not found");
        }
    }
}
