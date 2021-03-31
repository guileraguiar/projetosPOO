import java.util.Scanner;

class Main {
  public static void main(String[] args) {  
    Scanner num = new Scanner(System.in);
    
    System.out.println("\nFunção de Bukin");

    System.out.println("\nInforme o valor de x:");
    double x = num.nextDouble();

    if(x > -15 && x < -5) {
      System.out.println("\nInforme o valor de y:");
      double y = num.nextDouble();

        if(y > -3 && y < 3) {
          double x1 = 100 * Math.sqrt(Math.abs(y-(0.01 * Math.pow(x,2))));
          double x2 = 0.01 * Math.abs(x + 10);
          double result = x1 + x2;
          System.out.println("\nResultado = " + result);
        }else{
          System.out.println("\nValor y errado!");    
        }
    }else{
      System.out.println("\nValor x errado!");
    }
  }
}