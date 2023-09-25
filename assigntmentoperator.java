/*class Main {
  public static void main(String[] args) {
    double a = 3;
    double b = 3;
    double c = 3;
    double d = 3;
    a/=2;
    b*=3;
    c+=1;
    d-=9;
    System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);
  }
}*/




class Main {
  public static void main(String[] args) {
    int a = 7;
    
    System.out.println("addition: " + (a+=1));
    System.out.println("subtraction: " + (a-=1));
    System.out.println("multiplication: " + (a*=2));
    System.out.println("division: " + (a/=2));
  
  }
}
