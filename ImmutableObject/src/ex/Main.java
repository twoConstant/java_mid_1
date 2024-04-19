package ex;

public class Main {

    public static void main(String[] args) {
        ImmutableMyDate now = new ImmutableMyDate(2024, 4, 18);

        ImmutableMyDate immutableMyDate = now.withYear(2025);
        ImmutableMyDate immutableMyDate1 = now.withMonth(5);
        ImmutableMyDate immutableMyDate2 = now.withDate(31);

        System.out.println(now.toString());
        System.out.println(immutableMyDate.toString());
        System.out.println(immutableMyDate1.toString());
        System.out.println(immutableMyDate2.toString());
    }

}
