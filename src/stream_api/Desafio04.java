package stream_api;

import java.util.ArrayList;
import java.util.List;

public class Desafio04 {
    public static void removerTodosOsImpares(List<Integer> numeros) {
        System.out.print("Desafio 04: ");
        List<Integer> newList = new ArrayList<>(numeros);
        newList.removeIf(n -> n % 2 != 0);
        System.out.println(newList);
    }
}