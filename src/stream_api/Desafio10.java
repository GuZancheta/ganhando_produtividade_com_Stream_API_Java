package stream_api;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Desafio10 {
    public static void imparesMultiplosDeTresECinco(List<Integer> numeros) {
        System.out.print("Desafio 10: ");
        Map<Boolean, List<Integer>> collectMultiplos = numeros.stream()
                .collect(Collectors.groupingBy(i -> i % 2 != 0 && ((i % 3 == 0) || (i % 5 == 0))));
        System.out.println(collectMultiplos.get(true));
    }
}