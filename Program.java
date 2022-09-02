// Подключаем библиотеку
import java.util.Arrays;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {

        // Подключаем ввода с клавиатуры
        Scanner in = new Scanner(System.in);

        // Узнаём размер массива
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();

        // Создаём массив
        int[] number = new int[size];

        // Заполняем массив значениями элеммента
        for(int i = 0; i < size; i++){
            System.out.print("Введите значение " + i + "-го элемента массива: ");
            number[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(number));
    }
}