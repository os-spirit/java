public class myfirstprogram {


  public static void main(String[] args) {
    hello("world");
    hello("User");
    hello("Jora");

    double len = 5;
    System.out.println("Площадь квадрата со стороной" + len + " = " + area(len));

    double a = 4;
    double b = 8;
    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a,b));

  }

  public static void hello(String somebody) {
    System.out.println("Hello " + somebody + "!");
  }

  public static double area(double len) {
    return len * len;

  }

     public static double area(double a,double b){
    return a * b;
     }

}