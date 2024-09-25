public class TestDate {

  public static void main(String[] args) {

    //Create a Date object
    Date date = new Date(1,9,2024);

    //Print the date using the toString method
    System.out.print("Date: " + date.toString());

    //Modify the date using setters
    date.setDay(5);
    date.setMonth(10);
    date.setYear(2025);

    //Print the update date
    System.out.print("Updated Date: " + date.toString());

    //Set a new date using setDate method
    date.setDate(15, 11, 2023);

    //Print the newly set date
    System.out.print("Newly Set Date: " + date.toString());
  }
  
}
