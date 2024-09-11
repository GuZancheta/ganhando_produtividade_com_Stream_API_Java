package stream_api;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Desafio09 {
    public static void verificaSeNumerosSeRepetem(List<Integer> numeros) {
        System.out.print("Desafio 09: ");
        Set<Integer> numerosSet = new HashSet<>(numeros);
        System.out.println("Números se repetem? " + (numeros.size() != numerosSet.size()));
    }
}