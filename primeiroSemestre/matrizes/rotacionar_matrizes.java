import java.util.Scanner;
/*

Crie um método estático que recebe uma matriz e que faça a rotação de acordo com o angulo informado.

Por exemplo:

matriz = { { 2, 3 }, { 4, 5 } } 
Rotacionar 90 graus
Resultado
matriz = { { 4, 2 }, { 5, 3 } }

Graus permitidos
0, 90, 180, 270 e 360

Rotacione sempre no sentido horário. 

Considere apenas matrizes quadradas.

*/
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int i, j, k, l, m, n, tam = 0, escolha;

    System.out.print("\nInforme o tamanho da matriz quadrada: ");
    tam = input.nextInt();

    int [] [] matriz  = new int [tam] [tam];
    int [] [] rota90  = new int [tam] [tam];
    int [] [] rota180 = new int [tam] [tam];
    int [] [] rota270 = new int [tam] [tam];

    System.out.println(" ");

    for (i = 0; i < tam; i++){
      for (j = 0; j < tam; j++){
        System.out.print("Informe o valor da matriz: ");
        matriz [i] [j] = input.nextInt();
        System.out.println("");
      }
    }

    System.out.println("Matriz: \n");
    for (i = 0; i < tam; i++){
      for (j = 0; j < tam; j++){
        System.out.print(matriz [i] [j] + " ");
      }
        System.out.println("");
    }

    System.out.println("____________________________________________________ ");

    System.out.println("\nSelecione a opção em que a matriz irá rotacionar: ");
    System.out.println("\n1 = 0 grau \n2 = 90 graus \n3 = 180 graus \n4 = 270 graus \n5 = 360 graus\n"); 
    System.out.print ("Opção: ");   
    escolha = input.nextInt();
    System.out.println("");
  
    switch (escolha) {

      case 1: // 0 grau
        for (i = 0; i < tam; i++){
          for (j = 0; j < tam; j++){
            System.out.print(matriz [i] [j] + " ");
          }
          System.out.println("");
        }
        break;

      case 2: // 90 graus

        for (i = 0; i < tam; i++) {
          for (j = 0; j < tam; j++) {
            rota90 [i] [j] = matriz[tam - j - 1] [i];
            System.out.print(rota90 [i] [j] + " ");
          }
          System.out.println("");
        }
        break;

      case 3: // 180 graus

        for (i = 0; i < tam; i++) {
          for (j = 0; j < tam; j++) {
            rota90 [i] [j] = matriz [tam - j - 1] [i];
          }
        }

        for (k = 0; k < tam; k++) {
          for (l = 0; l < tam; l++) {
            rota180 [k] [l] = rota90 [tam - l - 1] [k];
            System.out.print(rota180 [k] [l] + " ");
          }
          System.out.println("");
        }
        break;

      case 4: // 270 graus = 90 graus

        for (i = 0; i < tam; i++) {
          for (j= 0; j < tam; j++) {
            rota90 [i] [j] = matriz [tam - j - 1] [i];
          }
        }

        for (k = 0; k < tam; k++) {
          for (l = 0; l < tam; l++) {
            rota180 [k] [l] = rota90 [tam - l - 1] [k];
          }
        }

        for (m = 0; m < tam; m++) {
          for (n = 0; n < tam; n++) {
            rota270 [m] [n] = matriz [tam - n - 1] [m];
            System.out.print(rota270 [m] [n] + " ");
          }
          System.out.println("");
        }
        break;
      
      case 5: // 360 graus = 0 grau

        for (i = 0; i < tam; i++){
          for (j = 0; j < tam; j++){
            System.out.print(matriz [i] [j] + " ");
          }
           System.out.println("");
        }
        break;

      default:
        System.out.println("Selecione uma opção válida. Tente novamente.");
    }

  }
}
