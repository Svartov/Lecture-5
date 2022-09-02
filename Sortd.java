// Подключаем библиотеку
import java.util.Arrays;
import java.util.Scanner;

public class Sortd {

    public static void main(String[] args) {

        // Подключаем ввода с клавиатуры
        Scanner in = new Scanner(System.in);

        // Переменные и массивы.
        int [] number = new int[]{0, 5, 2, 4, 7, 1, 3, 13};
        int sum = 0; // Будет выводить на консоль нечетные числа

        System.out.println(Arrays.toString(number)); // Выводим наш массив на консоль

        // Узнаём четный элемент, если он есть заменяем его на 0
        for(int i = 0; i < 8; i++){
            if(number[i] % 2 == 0 ){
                number[i] = 0;
            }
        }

        System.out.println(Arrays.toString(number)); // Выводим нечетные числа массива на консоль

        // Проходимся по массиву и если элемент больше 0, то мы добавляем +1 к сумме.
        for(int i = 0; i < 8; i++){
            if(number[i] > 0){
                sum = sum + 1;
            }
        }

        // Выводим сколько у нас есть нечётных чисел в массиве на консоль
        System.out.println("Количество нечетных элементов массива = " + sum);
    }
}
