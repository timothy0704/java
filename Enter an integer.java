import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer:");

    int data1 = input.nextInt();
    
    System.out.println("Using nextint():" + data1);

    input.close();
  }
}
