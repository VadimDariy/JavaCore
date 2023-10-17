package TRAINING.ARRAY;

import java.util.Arrays;

public class ClassArray {
    public static void main (String[] args) {
        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

         int[] ArrayCopy = Arrays.copyOf(numbers, numbers.length );
        System.out.println(Arrays.toString(ArrayCopy));
    }
}
/* Метод sort() класса Array используется для сортировки элементов массива в порядке возрастания. Если массив содержит
   числа, они будут отсортированы по возрастанию, а если массив содержит строки, они будут отсортированы в алфавитном
   порядке. Метод sort() изменяет исходный массив, переставляя элементы в нужном порядке.*/

/* Метод toString() класса Array используется для преобразования элементов массива в строку. Он объединяет все элементы
   массива в одну строку, разделяя их запятой. Метод toString() не изменяет исходный массив, а возвращает новую строку.*/