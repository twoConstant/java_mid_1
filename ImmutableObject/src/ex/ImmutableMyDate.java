package ex;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int date;

    public ImmutableMyDate(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public ImmutableMyDate withYear(int year) {
        return new ImmutableMyDate(year, this.month, this.date);
    }

    public ImmutableMyDate withMonth(int month) {
        return new ImmutableMyDate(this.year, month, this.date);
    }

    public ImmutableMyDate withDate(int date) {
        return new ImmutableMyDate(this.year, this.month, date);
    }

    @Override
    public String toString() {
        return this.year + "-" + this.month + "-" + this.date;
    }

}
