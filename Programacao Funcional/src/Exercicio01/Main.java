package Exercicio01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] aux = {"Carlos", "Angela", "Bia", "Ana", "Enzo"};

        List<String> lista = Arrays.asList(aux);

        /*lista.stream().filter(nome -> nome.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);*/


        List<String> resultado =  lista.stream()
                .filter(nome -> nome.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        resultado.forEach(System.out::println);
    }
}
