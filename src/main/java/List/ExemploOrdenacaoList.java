package List;
/* Dadas as seguintes informações sobre meus gatos, cire uma lista e ordene esta lista exibindo:
(nome - idade - cor);
List.Gato 1 = nome: John, idade: 18, cor: preto
List.Gato 2 = nome: Simba, idade: 6, cor: tigrado
List.Gato 3 = nome: John, idade: 12, cor: amarelo
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("John", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("John", 12, "amarelo"));
        }};
        System.out.println(meusGatos);

        System.out.println("---\tOrdem de Inserção\t---");
        System.out.println(meusGatos);

        System.out.println("---\tOrdem Aleatória\t---");
        Collections.shuffle(meusGatos); // Comando para bagunçar uma lista
        System.out.println(meusGatos);

        System.out.println("---\tOrdem Natural (Nome)\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("---\tOrdem Idade\t---");
        Collections.sort(meusGatos, new ComparatorIdade());
        //meusGatos.sort(new List.ComparatorIdade()); //Esse comando assim como o da linha superior fazem a mesma função
        System.out.println(meusGatos);

        System.out.println("---\tOrdem Cor\t---");
        meusGatos.sort(new Comparatorcor());
        System.out.println(meusGatos);

        System.out.println("---\tOrdem Nome/Cor/Idade\t---");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);



    }
}
class Gato implements Comparable<Gato>{
    // Esse método comparable obriga a sobrescrever o método compareTo
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        // Retornar o int e esse int vai sendo organizado na ordem
        return this.getNome().compareToIgnoreCase(gato.getNome());
        // pelo fator de ser uma string, a própria string já tem esse método compareToIgnoreCase
        // 0 - quer dizer que os nomes são iguais
        // 1 - quer dizer que o nome tem que ficar após com o que está sendo comparado
        // -1 - quer dizer que o nome tem que ficar antes do nome que está sendo comparado
    }
}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
class Comparatorcor implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

       int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
       if (cor != 0) return cor;

       return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
