public class TestTime {
  public static void main(String[] args) {

    //Create two Time objects
    Time t1 = new Time(21, 10,
     15);
     Time t2 = new Time(10, 20, 25);

     //Display initial times
     System.out.print("Initial Time t1: " + t1.toString());
     System.out.print("Initial Time t2: " + t2.toString());

     //Call nextSecond() for t1 and previousSecond() for t2
     t1.nextSecond();
     t2.previousSecond();

     //Display final times
     System.out.print("Final Time t1 after nextSecond(): " + t1.toString());
     System.out.print("Final Time t2 after previousSecond(): " + t2.toString());
  }
}
