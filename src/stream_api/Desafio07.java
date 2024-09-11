package stream_api;

import java.util.Comparator;
import java.util.List;

public class Desafio07 {
    public static void segundoMaiorNumero(List<Integer> numeros) {
        System.out.print("Desafio 07: ");
        numeros.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
    }
}