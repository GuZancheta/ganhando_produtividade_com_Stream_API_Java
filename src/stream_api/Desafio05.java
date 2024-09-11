package stream_api;

import java.util.List;

public class Desafio05 {
    public static void mediaNumerosMaioresQueCinco(List<Integer> numeros) {
        System.out.print("Desafio 05: ");
        numeros.stream().filter(n -> n > 5).mapToInt(Integer::intValue).average().ifPresent(System.out::println);
    }
}