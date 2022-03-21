package br.com.dio.collection.streamAPI;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExcerciciosStreamAPI {
    public static void main(String[] args) {

        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "2", "3", "9", "9", "6", "5");
        System.out.println("imprima todos os elementos dessa lista de String");
        // numerosAleatorios.stream().forEach(so);

        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 ultimos primeiros numeros e coloque dentro de um Set: ");

        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach (System.out::println);

        System.out.println("Transforme esta lista de String em uma lista de numero inteiros.");
        List<Integer> collectList =  numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Pegue os numero pares e maiores que 2 e coloque em uma lista");

        List<Integer> listParesMaioresQue2 =  numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter( i-> i % 2 == 0 && i> 2).collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);

        System.out.println("Mostre a media dos numeros:");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os impares: ");
        List<Integer> numerosAleatoriosInteiros = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        numerosAleatoriosInteiros.removeIf(i -> (i %2 !=0));

        System.out.println(numerosAleatoriosInteiros);



    }


}
