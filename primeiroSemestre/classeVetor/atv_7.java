import java.util.Scanner;

/*

Crie um programa java que realize a multiplicação de matrizes e apresente o
resultado final. Utilize as matrizes A e B abaixo.

Modifique o programa anterior, para que o usuário possa informar as matrizes
que de seja informar.

*/

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("\nInforme o tamanho da matriz A:  ");
    int tamA = sc.nextInt();

    System.out.print("____________________________________________\n");

    System.out.print("\nInforme o tamanho da matriz B:  ");
    int tamB = sc.nextInt();

    int i, j, k, lineA = tamA, columnA = tamA;
    int [] [] matrizA = new int [lineA] [columnA];

    int lineB = tamB, columnB = tamB;
    int [] [] matrizB = new int [lineB] [columnB];

    System.out.print("____________________________________________\n");
    System.out.println("");

    for (i = 0; i < lineA; i++){
      for (j = 0; j < columnA; j++){
        System.out.print("Digite o valor da Matriz A: ");
        matrizA [i] [j] = sc.nextInt();
      }
    }

    System.out.println("");

    for (i = 0; i < lineB; i++){
      for (j = 0; j < columnB; j++){
        System.out.print("Digite o valor da Matriz B: ");
        matrizB [i] [j] = sc.nextInt();
      }
    }

    System.out.println(" ");

    for (i = 0; i < lineA; i++){
      for (j = 0; j < columnA; j++){
        System.out.print(matrizA [i] [j] + " ");
      }
      System.out.println(" ");
    }

    System.out.println(" ");

    for (i = 0; i < lineB; i++){
      for (j = 0; j < columnB; j++){
        System.out.print(matrizB [i] [j] + " ");
      }
      System.out.println(" ");
    }

    if(matrizA[0].length == matrizA.length) {
        int [] [] matrizC = new int[lineA] [columnB];

        for (i = 0; i < lineA; i++){
            for (j = 0; j < columnB; j++){
                for (k = 0; k < lineB; k++){
                    matrizC [i] [j] += matrizA [i] [k] * matrizB [k] [j];
                }   
            }
        }

        System.out.println("");

        for (i = 0; i < lineA; i++){
            for (j = 0; j < columnB; j++){
                System.out.print(matrizC [i] [j] + " ");
            }
            System.out.println("");
        }
    
    System.out.println("");
    
    }else{
        System.out.print("Não é possível realizar esta operação.");
    }

  }
}