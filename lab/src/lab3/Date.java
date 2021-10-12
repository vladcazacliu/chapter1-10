package lab3;

public class Date{
    private int month, day, year;

    public Date(int month, int day, int year){
        setMonth(month);
        setDay(day);
        setYear(year);
    }
    // setters
    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setYear(int year){
        this.year = year;
    }
    // getters
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public int getYear(){
        return year;
    }
    // display date
    public void displayDate(){
        System.out.printf("%d/%d/%d\n", getMonth(), getDay(), getYear());
    }
}
