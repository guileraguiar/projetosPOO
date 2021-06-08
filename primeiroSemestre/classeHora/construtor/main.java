package construtor;
import java.util.Scanner;

public class main {
	
	public static void main (String[] args) {
		
		Scanner str = new Scanner(System.in);
		
		Tempo caller = new Tempo();
		
		int hora;
		int minuto;
		int segundo;
		int milissegundo;
		int escolha1;
		int escolha2;
		int resetar;
		
		System.out.println("Hora inicial: ");
		caller.formatoTempo();
		
		System.out.println("\nVocê deseja aumentar ou diminuir tempo? \n1 => Aumentar \n2 => Diminuir \nQualquer Número => Sair.");
		escolha1 = str.nextInt();
		
		if (escolha1 == 1) {
			System.out.println("\nVocê deseja aumentar hora, minuto, segundo ou milissegundo? \n 1 => Hora \n 2 => Minuto \n 3 => Segundo \n 4 => Milissegundo");
			escolha2 = str.nextInt();
				if (escolha2 == 1) {
					hora = str.nextInt();
					caller.setHora(hora);
				}else if (escolha2 == 2) {
					minuto = str.nextInt();
					caller.setMinuto(minuto);
				
				}else if (escolha2 == 3) {
					segundo = str.nextInt();
					caller.setMinuto(segundo);
					
				}else if (escolha2 == 4) {
					milissegundo = str.nextInt();
					caller.setMinuto(milissegundo);
				}	
				
		}else if(escolha1 == 2) {
			System.out.println("\nVocê deseja diminuir hora, minuto, segundo ou milissegundo? \n 1 => Hora \n 2 => Minuto \n 3 => Segundo \n 4 => Milissegundo");
			escolha2 = str.nextInt();
				if (escolha2 == 1) {
					hora = str.nextInt();
					caller.setHora(hora);
				}else if (escolha2 == 2) {
					minuto = str.nextInt();
					caller.setMinuto(minuto);
			
				}else if (escolha2 == 3) {
					segundo = str.nextInt();
					caller.setMinuto(segundo);
				
				}else if (escolha2 == 4) {
					segundo = str.nextInt();
					caller.setMinuto(segundo);
				}	
			}else{
				System.exit(0);
		}

		System.out.println("Deseja resetar o tempo? \n1 => Sim \nQualquer Número => Não");
		resetar = str.nextInt();
		
		if (resetar == 1) {
			caller.resetarTempo();
			caller.formatoTempo();
		}else{
			System.out.println("Tempo atual:");
			caller.formatoTempo();
		}
		
	}
}
