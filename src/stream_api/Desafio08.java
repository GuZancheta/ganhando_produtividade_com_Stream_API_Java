package stream_api;

import java.util.Comparator;
import java.util.List;

public class Desafio08 {
    public static void somarTodosOsElementos(List<Integer> numeros) {
        System.out.print("Desafio 08: ");
        System.out.println(numeros.stream().reduce(0, Integer::sum));
    }
}