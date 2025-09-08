package Exercicio03;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Character, Integer> contador = new HashMap<>();
        String frase;

        System.out.print("Informe uma frase --> ");
        frase = in.nextLine();

        for(char c : frase.toLowerCase().toCharArray()){
            if(Character.isLetter(c)){
//                int aux = contador.get(c);
                contador.put(c, contador.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : contador.entrySet()){
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }

        //ordenado
        System.out.println();
        Set<Character> chave = contador.keySet();
        TreeSet<Character> arvore = new TreeSet<>(chave);
        for (Character c : arvore){
            System.out.println(c + " --> " + contador.get(c));
        }
    }
}
