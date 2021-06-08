/*

Modele uma classe que represente uma hora.
A hora deverá conter hora, minutos, segundos e milissegundos.
A classe deverá ter mecanismos para acrescentar ou diminir algum tempo, O tempo poderá ser  em horas, minutos, segundos ou milisegundos.
Também poderá ser acrescentado ou removido um objeto Hora.
Deverá ser respeitado os limites das horas. Exemplo: Se tiver 0 horas e 11 minutos e acrescentar mais 50 minutos, o resultado deverá ser 1 hora e 01 minuto.

A classe deverá ter mecanismos para transformar a informação em texto.
A hora poderá estar formato am/pm ou 24h.
Crie uma forma de transformar a Hora em milisegundos.

Um objeto Hora poderá ser comparado com outro objeto Hora.

Quando criar um objeto novo, considere 00:00:00:00.
Mas pode acrescentar construtores que recebem valores para o hora,
minuto, segundo ou milisegundos.


Faça o diagrama de classe UML que represente a classe desenvolvida,
e crie exemplos de uso da classe.

HH:MM:SS:ML.
00:00:00:00.

*/

package construtor;

public class Tempo extends Object {
    
	private int hora = 0;
    private int minuto = 0;
    private int segundo = 0;
    private int milissegundo = 0;
       
	public void setHora(int hora) {
		this.hora = hora;
	}
    
	public int getHora() {
		return hora;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	
	public int getMinuto() {
		return minuto;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	public int getSegundo() {
		return segundo;
	}
	
	public void setMilissegundo(int milissegundo) {
		this.milissegundo = milissegundo;
	}
	
	public int getMilissegundo() {
		return milissegundo;
	}

 
	private int[] form() {
		int[] formatoTempo = new int[4];
		
		while (minuto >= 60) {
			hora++;
			minuto = minuto - 60;
		}
		
		while (segundo >= 60) {
			minuto++;
			segundo = segundo - 60;
		}
		
		while (milissegundo >= 1000) {
			segundo++;
			milissegundo = milissegundo - 1000;
		}
		
		formatoTempo[0] = hora;
		formatoTempo[1] = minuto;
		formatoTempo[2] = segundo;
		formatoTempo[3] = milissegundo;
		return formatoTempo;
	}

	private int[] formMenos() {
		int[] formatoTempo = new int[4];
		
		while (minuto >= 60) {
			hora--;
			minuto = minuto - 60;
		}
		
		while (segundo >= 60) {
			minuto--;
			segundo = segundo - 60;
		}
		
		while (milissegundo >= 1000) {
			segundo--;
			milissegundo = milissegundo - 1000;
		}
		
		formatoTempo[0] = hora;
		formatoTempo[1] = minuto;
		formatoTempo[2] = segundo;
		formatoTempo[3] = milissegundo;
		return formatoTempo;
	}
	
    public void formatoTempo() {
    	
    	System.out.printf(getHora() + ":" + getMinuto() + ":" + getSegundo() + ":" + getMilissegundo());
    }
    
    public void resetarTempo () {
    	this.hora = 0;
    	this.minuto = 0;
    	this.segundo = 0;
    	this.milissegundo = 0;
    }
    
}
