package innerclass_2.ex2;

public class Main {

    public static void main(String[] args) {
        Library library = new Library(4);
        library.addBook("책1", "저자1");
        library.addBook("책2", "저자2");
        library.addBook("책3", "저자3");
        library.addBook("책4", "저자4");
        library.addBook("책4", "저자4");
        library.showBook();
        library.popBook();
        library.popBook();
        library.popBook();
        library.popBook();
        library.popBook();
        library.showBook();

    }

}
