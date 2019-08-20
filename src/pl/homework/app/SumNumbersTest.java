package pl.homework.app;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static pl.homework.lib.Numbers.*;

public class SumNumbersTest {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczty całkowite (liczba ujemna kończy wprowadzanie): ");
        System.out.println("Podaj liczbę :");
        int number = scanner.nextInt();
        scanner.nextLine();
        while (number >= 0) {
            list.add(number);
            System.out.println("Podaj  kolejną liczbę :");
            number = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.print("Wczytane liczby: " + realOrderElements(list) + "\n");
        System.out.print("Wczytane liczby odwrotnie: " + reverseOrderElements(list) + "\n");

        System.out.println("Suma liczb na liście: ");
        for (Integer element: list) {
            System.out.print(element + " + ");
        }
        System.out.print(" = " + sumElements(list) + "\n");
        System.out.print(" Największy element = " + maxElement(list) + "\n");
        System.out.print(" Najmniejszy element = " + minElement(list) + "\n");
    }
}
