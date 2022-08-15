import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner s = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        String title;
        int pages, publicationYear;

        while (true) {
            System.out.println("Title: ");
            title = s.nextLine();

            if (title.equals("")) {
                break;
            }

            System.out.println("Pages: ");
            pages = Integer.valueOf(s.nextLine());
            System.out.println("Publication Year: ");
            publicationYear = Integer.valueOf(s.nextLine());

            books.add(new Book(title, pages, publicationYear));
        }

        System.out.println("What information will be printed?");
        String information = s.nextLine();

        if (information.equals("name")) {
            for  (Book book:books) {
                System.out.println(book.getTitle());
            }
        } else if (information.equals("everything")) {
            for (Book book:books) {
                System.out.println(book);
            }
        }

    }
}
