import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int[] seatNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    String[] studentNames = new String[15];

    Scanner scan = new Scanner(System.in);

    for (int i = 0; i < seatNumbers.length; i++) {
      System.out.println("What is the student's name?");
      studentNames [i] = scan.next();
    }

    int b = 0;
    while (b < seatNumbers.length);
    {
      System.out.println(studentNames[b] + "sits in seat # " + seatNumbers[b]);
      b++;
    }
  }
}