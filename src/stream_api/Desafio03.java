package stream_api;

import java.util.List;

public class Desafio03 {

    public static void verificarSeTodosSaoPositivos(List<Integer> numeros) {
        System.out.print("Desafio 03: ");
        System.out.println(numeros.stream().allMatch(n -> n > 0));
    }
}
