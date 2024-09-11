package stream_api;

import java.util.List;

public class Desafio01 {

    public static void ordenarLista(List<Integer> numeros) {
        System.out.print("Desafio 01: ");
        System.out.println(numeros.stream().sorted().toList());
    }
}
