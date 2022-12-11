package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExercicioFinalList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        System.out.println("Adicione 5 nomes e exiba no console");
        names.add("Juliana");
        names.add("Pedro");
        names.add("Carlos");
        names.add("Larissa");
        names.add("João");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println("--> " + iterator.next());
        }

        System.out.println("-----------------------------------------------------");

        System.out.println("Substitua o nome de Carlos por Roberto");
        names.set(2, "Roberto");
        names.forEach(e -> System.out.println("-->> " + e));

        System.out.println("-----------------------------------------------------");

        System.out.println("Retorne o nome da posição 1 (index 0): " + names.get(0));

        System.out.println("-----------------------------------------------------");

        System.out.println("Remova o nome da posição 4 (index 3)");
        names.remove(3);
        names.forEach(e -> System.out.println("--->> " + e));

        System.out.println("-----------------------------------------------------");
        System.out.println("Remova o nome João");
        names.remove("João");
        names.forEach(e -> System.out.println("-->> " + e));

        System.out.println("-----------------------------------------------------");

        System.out.println("Retorne a quantidades de item na lista: " + names.size());

        System.out.println("-----------------------------------------------------");

        System.out.println("Verifique se contem o nome Juliano na lista: " + names.contains("Juliano"));

        System.out.println("-----------------------------------------------------");

        System.out.println("Crie uma nova lista contendo 2 nomes");
        List<String> newList = new ArrayList<>();
        newList.add("Ismael");
        newList.add("Rodrigo");

        Iterator<String> iteratorNewList = newList.iterator();
        while (iteratorNewList.hasNext()) {
            System.out.println("newList ->>" + iteratorNewList.next());
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("Adicione os item da nova lista na lista anterior");
        names.addAll(newList);

        while (iterator.hasNext()) {
            System.out.println("--> " + iterator.next());
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("Ordene os item da lista em ordem alfabetica");

        names.stream().sorted().forEach(System.out::println);

        System.out.println("-----------------------------------------------------");
        System.out.println("A lista está vazia?" + names.isEmpty());


        System.out.println("-----------------------------------------------------");
    }
}
