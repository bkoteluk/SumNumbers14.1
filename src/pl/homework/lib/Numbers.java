package pl.homework.lib;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

    public static String realOrderElements(List<Integer> list) {
        String elements = "";
        for (Integer element: list) {
            elements += element + ", ";
        }
        return elements;
    }

    public static String reverseOrderElements(List<Integer> list) {
        String elements = "";
        for (int i = (list.size()-1); i >= 0; i --) {
            elements += list.get(i) + ", ";
        }
        return elements;
    }

    public static int sumElements(List<Integer> list) {
        int sum = 0;
        for (Integer element: list) {
            sum += element;
        }
        return sum;
    }

    public static int maxElement(List<Integer> list) {
        int max = list.get(list.size()-1);
        for (Integer element: list) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }

    public static int minElement(List<Integer> list) {
        int min = list.get(list.size()-1);
        for (Integer element: list) {
            if (min > element) {
                min = element;
            }
        }
        return min;
    }
}
