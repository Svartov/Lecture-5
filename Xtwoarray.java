// Подключаем библиотеку
import java.util.Arrays;
import java.util.Random;

public class Xtwoarray {

    public static void main(String[] args) {

        // Переменные и массивы и рандом.
        Random randomnumber = new Random(); // Создаём рандом
        int [] number = new int[15]; // Первый массив
        int [] secondnumber = new int[30]; // Второй массив

        // Заполнение массива рандомными числами.
        for (int i = 0; i < number.length; i++) {
            number[i] = randomnumber.nextInt(20);
            secondnumber[i] = number[i]; // Заполнение массива №2, значением массива №1.
            secondnumber[i + 15] = number[i] * 2; // Заполнение массива №2 от 15-го элемента умноженными значениями массива №1 на 2.
        }

        System.out.println(Arrays.toString(number)); // Выводим на консоль элементы первого массива.
        System.out.println(Arrays.toString(secondnumber)); // Выводим на консоль  элементы второго массива (готовое задание).
    }
}
