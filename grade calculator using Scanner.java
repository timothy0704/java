import java.util.Scanner;
class Main {
  public static void main(String[] args) {

Scanner input = new Scanner(System.in);

    System.out.print("Enter the grade:");
int n = input.nextInt();
    if(n>=90){
      System.out.println("The grade is A");
    }
      else if(n>=80){
        System.out.println("The grade is B");
      }
        else if(n>=70){
          System.out.println("The grade is C");
        }
          else if(n>=60){
          System.out.println("The grade is D");
        }
            else {
          System.out.println("The grade is F");
        }

  }
}
