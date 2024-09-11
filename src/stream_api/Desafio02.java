package stream_api;

import java.util.List;

public class Desafio02 {

    public static void imprimirSomaNumerosPares(List<Integer> numeros) {
        System.out.print("Desafio 02: ");
        System.out.println(numeros.stream().filter(n -> n % 2 == 0).reduce(0, Integer::sum));
    }
}
