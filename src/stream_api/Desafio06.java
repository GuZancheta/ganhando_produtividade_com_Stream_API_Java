package stream_api;

import java.util.List;

public class Desafio06 {
    public static void possuiNumeroMaiorQueDez(List<Integer> numeros) {
        System.out.print("Desafio 06: ");
        System.out.println(numeros.stream().anyMatch(n -> n > 10));
    }
}