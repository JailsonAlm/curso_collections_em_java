package List;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class Lists {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: "+notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        // indexof - retorna a posição de um determinado elemento
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: "+notas.contains(5d));
        // retorna false ou true após verificar se um elemento está na lista ou não

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota: notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: "+notas.get(2));
        // passa a posição e retorna o elemento que está nesse posição
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: "+ Collections.min(notas));
        // pelo fato da lista ser uma collections, utiliza o comando collections para exibir a menor nota
        // pelo fato de não ter um comando especifico no list para isso

        System.out.println("Exiba a maior nota: " +Collections.max(notas));

        var iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: "+soma);

        System.out.println("Exiba a média das notas: "+soma/notas.size());

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> interator1 = notas.iterator();
        while(interator1.hasNext()){
            Double next = interator1.next();
            if (next<7) interator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear(); // esse método apaga toda a lista
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: "+notas.isEmpty());

        /* Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:

        System.out.println("Crie uma lista chamada notas2 " + "e coloque todos os elementos da list Arrayist nessa nova lista: ");

        System.out.println("Mostre a primeira nota da lista sem removê-lo: ");

        System.out.println("Mostre a primeira nota da lista removendo-o: ");
        */

        //https://www.youtube.com/watch?v=YQQio9BGWgs




    }

}
