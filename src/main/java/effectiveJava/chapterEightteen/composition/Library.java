package main.java.effectiveJava.chapterEightteen.composition;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import java.util.List;

public class Library {
    private final List<Book> books;

    public Library(List<Book> books) {
        this.books=books;
    }

    public List<Book> getBooks() {
        return books;
    }
}
