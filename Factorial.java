import java.util.Scanner;

public class Factorial{
  public static void main(String[] args) {
    System.out.println ("\n\nPlease enter value of Factorial: ");
    Scanner scan;
    scan = new Scanner(System.in);
    int n = scan.nextInt();
    long factor = 1;
    for (int i = 1; i < n; i++)
      {
        factor += factor * i ;   //factor = 1*2*3* ... *n
      }
    System.out.println ("Factorial "+n+"(!) = "+factor);
  }
}