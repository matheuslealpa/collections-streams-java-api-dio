package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static common.ConsoleUtil.headers;
import static common.ConsoleUtil.question;

public class ExercicioFinalList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        headers("Exercicio Final - List");

        question("Adicione 5 nomes e exiba no console");
        names.add("Juliana");
        names.add("Pedro");
        names.add("Carlos");
        names.add("Larissa");
        names.add("João");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println("--> " + iterator.next());
        }

        question("Substitua o nome de Carlos por Roberto");
        names.set(2, "Roberto");
        names.forEach(e -> System.out.println("-->> " + e));

        question("Retorne o nome da posição 1 (index 0): " + names.get(0));

        question("Remova o nome da posição 4 (index 3)");
        names.remove(3);
        names.forEach(e -> System.out.println("--->> " + e));

        question("Remova o nome João: ");
        names.remove("João");
        names.forEach(e -> System.out.println("-->> " + e));

        question("Retorne a quantidades de item na lista: " + names.size());

        question("Verifique se contem o nome Juliano na lista: " + names.contains("Juliano"));

        question("Crie uma nova lista contendo 2 nomes");
        List<String> newList = new ArrayList<>();
        newList.add("Ismael");
        newList.add("Rodrigo");

        Iterator<String> iteratorNewList = newList.iterator();
        while (iteratorNewList.hasNext()) {
            System.out.println("newList ->>" + iteratorNewList.next());
        }

        question("Adicione os item da nova lista na lista anterior");
        names.addAll(newList);

        while (iterator.hasNext()) {
            System.out.println("--> " + iterator.next());
        }

        question("Ordene os item da lista em ordem alfabetica");

        names.stream().sorted().forEach(System.out::println);

        question("A lista está vazia?" + names.isEmpty());
    }
}
