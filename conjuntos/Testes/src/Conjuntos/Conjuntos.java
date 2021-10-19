package Conjuntos;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Conjuntos {

    public static void main(String[] args){

        // União
        List<Integer> listaA = new ArrayList<>();
        listaA.add(4);
        listaA.add(6);
        listaA.add(10);

        List<Integer> listaB = new ArrayList<>();
        listaB.add(2);
        listaB.add(7);
        listaB.add(12);

        List<Integer> listauniao = Stream.concat(listaA.stream(), listaB.stream()).collect(Collectors.toList());
        System.out.println("Lista com União: " + listauniao);

        // Intersecção
        List<Integer> listaC = new ArrayList<>();
        listaC.add(4);
        listaC.add(6);
        listaC.add(10);

        List<Integer> listaD = new ArrayList<>();
        listaD.add(5);
        listaD.add(6);
        listaD.add(11);

        List<Integer> listainterseccao = listaC.stream().filter(listaD::contains).collect(Collectors.toList());
        System.out.println("Lista com Intersecção: " + listainterseccao);

        // Diferença
        List<Integer> listaE = new ArrayList<>();
        listaE.add(4);
        listaE.add(6);
        listaE.add(1);

        List<Integer> listaF = new ArrayList<>();
        listaF.add(4);
        listaF.add(6);
        listaF.add(8);

        Collection<Integer> diferenca = new HashSet<Integer>();

        diferenca.addAll(listaE);
        diferenca.addAll(listaF);
        diferenca.removeAll(listaF);

        List<Integer> listadiferenca = new ArrayList<Integer>(diferenca);
        System.out.println("Lista com Diferença: " + listadiferenca);

        // Complementar
        List<Integer> listaG = new ArrayList<>();
        listaG.add(3);
        listaG.add(4);
        listaG.add(6);

        List<Integer> listaH = new ArrayList<>();
        listaH.add(3);
        listaH.add(5);
        listaH.add(6);

        Collection<Integer> complemento = new HashSet<Integer>();

        complemento.addAll(listaG);
        complemento.addAll(listaH);
        complemento.removeAll(listaG);

        List<Integer> listacomplemento = new ArrayList<Integer>(complemento);
        System.out.println("Lista com Complemento: " + listacomplemento);

    }
}