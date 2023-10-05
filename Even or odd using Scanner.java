import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number:");

    int n = input.nextInt();
    
    if(n%2==0){
      System.out.print("The number is even");
    }
    else{
      System.out.print("The number is odd number");
    }

    input.close();
  }
}
