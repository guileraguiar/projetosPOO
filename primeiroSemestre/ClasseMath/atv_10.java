import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);

    System.out.println("Função de Ackley N.3");

    System.out.println("\nInforme o valor de x:");
    double x = num.nextDouble();

    System.out.println("\nInforme o valor de y:");
    double y = num.nextDouble();

    if(y > -32 && y < 32){
      double part1 = -200*Math.exp(-0.2*Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));

      double part2 = 5*Math.exp(Math.cos(3*x) + Math.sin(3*y));

      double result = part1 + part2;

      System.out.println("\nResultado: " + result);
    }else{
      System.out.println("\nValor de y incorreto");

    }s
  }
}