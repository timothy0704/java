import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter two numbers:");
     
    

    int num1 = input.nextInt();
    int num2 = input.nextInt();
    
    System.out.println("Number is " + (num1+ num2));

    input.close();
  }
}
