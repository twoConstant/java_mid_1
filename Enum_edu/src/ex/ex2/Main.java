package ex.ex2;



public class Main {

    public static void main(String[] args) {
        // Enum 목록을 만들고
        AuthGrade[] authGrades = AuthGrade.values();

        for (AuthGrade authGrade : authGrades) {
            authGrade.getContent();
        }
    }

}
