import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter Double value:");
     
    double value = input.nextDouble();
    
    System.out.println("value is " + value);

    input.close();
  }
}
