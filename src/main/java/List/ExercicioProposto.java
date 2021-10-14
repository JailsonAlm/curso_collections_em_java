package List;

/* Faça um programa que receba a temperatura média dos 6 primeiro meses do ano e armazene-as em uma lista.
Aós isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que mês
elas ocorreram (mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro e etc).
 */

import java.util.*;
import java.lang.Double;

class ExercicioProposto1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperatura = new ArrayList<Double>();

        //Adicionando as temperaturas na lista:
        int count = 0;
        while (true){
            if (count == 6)break;

            System.out.println("Digita a temperatura: ");
            double temp = scan.nextDouble();
            temperatura.add(temp);
            count++;
        }
        System.out.println("-----------------------------");

        //Exebindo todas as temperatura:
        System.out.println("Todas as temperaturas: ");
        //System.out.println(temperatura);
        temperatura.forEach(t-> System.out.println(t + " ")); //Imprimir a informação pulando linhas

        //Calculando e exebindo a media das temperaturas:
        double media = temperatura.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
        System.out.printf("\nMedia das Temperaturas: %.1f\n", media);

        //Exibindo o mês das temperaturas acima da média por extenso:
        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperatura.iterator();

        count = 0;
        while (iterator.hasNext()){
            Double temp = iterator.next();
            if (temp > media){
                switch (count){
                    case (0):
                        System.out.printf("1 - Janeiro: %.1f\n", temp);
                        break;
                    case (1):
                        System.out.printf("2 - Fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - Março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - Abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - Maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - Junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;
        }


    }

}

