import java.util.Scanner;

/*

--Traduções--

attempts = tentativas
hided = escondido
count = contador
won = ganhou, no contexto, acertou
letter = letra
secret = secreta
word = palavra
secret word = palavra secreta
index = índice

--Atividade--

7) Crie um programa Java que simule um jogo da forca. O computador sempre
utilizada a palavra ”abacaxi” para ser adivinhada pelo jogador. O programa
deverá apresentar em tela asteriscos ao inves da palavra. Quando o jogador
acertar uma letra, deverá ser exibido a letra no lugar do asterisco. O jogador
terá 3 chances e quando acertar a palavra inteira ou perder todas as chances, o
programa dever´a finalizar.

****
8) Modifique o programa da forca, para que o usu´ario possa informar a palavra
secreta.
****

*/


class Main {
  public static void main(String[] args) {
    int count = 0;
    int attempts = 3;
    char hided = '*';
    String secretWord = "";
    boolean won = true;

    Scanner str = new Scanner(System.in);

    System.out.println("\nVamos jogar o jogo da velha!");

    System.out.println("\nInforme a palavra que vai ser utilizada: ");
    String upWord = str.nextLine();

    String word = upWord.toLowerCase();

    int lenWord = word.length();

    while(count < lenWord){
      secretWord += hided;
      count ++;
    }

    while(attempts > 0){
      System.out.println("\nA palavra é: " + secretWord);
      System.out.println("\nVocê tem: " + attempts + " chances.");
      System.out.println("\nAdivinhe uma letra: ");
      String letter = str.nextLine();

      won = word.contains(letter);

      if(won){
        System.out.println("_______________________");
        System.out.println("\nAcertou!");
        int index = word.indexOf(letter);

        while(index >= 0){
          secretWord = secretWord.substring(0,index) + letter + secretWord.substring(index + 1);
          index = word.indexOf(letter, index + 1);
        }
        if(!secretWord.contains("*")){
          System.out.println("\nParabéns, você ganhou! Copie o link para acrescentar a sua vitória! - https://www.youtube.com/watch?v=vnUscCCmPG0");
          break;
        }

      }else{
        System.out.println("\nErou! (voz do Faustão)");
        System.out.println("_______________________");
        attempts--;
        if(attempts == 0){
          System.out.println("\nNão foi dessa vez :(");
          break;
        }
      }
    }

  }
}
