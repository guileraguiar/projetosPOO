/*

Modele uma classe que represente uma hora.
A hora deverá conter hora, minutos, segundos e milisegundos.
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

*/


import java.util.Scanner;

public class Hora {
    
    // Atributos
    private float milisegundo;
    private float segundo;
    private float minuto;
    
    // Construtor
    public Hora(){    }

    //Getters e Setters

    public void setMilisegundo(float valor){
        this.milisegundo = valor;

    }

    public float getMilisegundo(){
        return milisegundo;
    }
}