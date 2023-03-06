package effectiveJava.chapterEightteen;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import effectiveJava.chapterEightteen.composition.Book;
import effectiveJava.chapterEightteen.composition.Library;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //we can access all method from another class.It's bad.We broke encapsulation
        BadInheritance bi=new BadInheritance();

        EditWithComposition ewc=new EditWithComposition();

        Book book=new Book("Effective Java");
        Book book1=new Book("Head First Java");
        Book book2=new Book("Java 8 in Action");

        List<Book> books=List.of(book,book1,book2);

        Library library=new Library(books);
        for (Book b:library.getBooks()) {
            System.out.println(b.getName());
        }
    }
}
