public class Date {

  //Instance variables
  private int day;
  private int month;
  private int year;

  //Constructor
  public Date (int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  //Getter methods
  public int getDay() {
    return day;
  }

  public int getMonth() {
    return month;
  }

  public int getYear() {
    return year;
  }

  //Setter methods
  public void setDay(int day) {
    this.day = day;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void setDate(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  //toString method to return date in "dd/mm/yyyy" format @Override

  public String toString() {

    //String.format ensures leading zeros for day and month

    return String.format("%02d/%02d/%04d", day, month, year);
  }
}