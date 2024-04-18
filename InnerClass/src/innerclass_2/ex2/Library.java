package innerclass_2.ex2;

import java.util.Stack;

public class Library {
    private int size;
    private Stack<Book> bookStack = new Stack<>();

    public Library(int size) {
        this.size = size;
    }

    public class Book{
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }

    public void addBook(String title, String author) {
        if(!isInRange()){
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        Book book = new Book(title, author);
        this.bookStack.push(book);
        System.out.println("저장되었습니다.");
    }

    public void popBook(){
        if(!bookStack.isEmpty()) {
            Book popedBook = this.bookStack.pop();
            System.out.println(popedBook.title + "을 빼냅니다.");;
            return;
        }
        System.out.println("뺴낼 책이 없습니다.");
    }


    public void showBook() {
        System.out.println("==책 목록 출력==");
        for (Book book : bookStack) {
            System.out.printf("도서 제목: %s, 저자: %s\n", book.title, book.author);
        }
    }


    public boolean isInRange() {
        return bookStack.size() < this.size;
    }
}
