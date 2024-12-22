import java.math.BigInteger;
import java.util.Scanner;

import static java.io.IO.print;

public class Main {
    public static void main(String[] args) {

/*Задача 1
В банке для клиентов организовывается доставка карт на дом. Чтобы известить клиента о том, когда будет доставлена его карта, нужно знать расстояние от офиса до адреса доставки.
Правила доставки такие:
• Доставка в пределах 20 км занимает сутки.
• Доставка в пределах от 20 км до 60 км добавляет еще один день
доставки.
• Доставка в пределах от 60 км до 100 км добавляет еще одни сутки.
• Свыше 100 км доставки нет.
То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
Напишите программу, которая выдает сообщение в консоль: «Потребуется дней: ... » + срок доставки.
Объявите целочисленную переменную
deliveryDistance = 95 которая содержит дистанцию до клиента.
*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите растояние: ");
        int distance = scanner.nextInt();
        int delivaryDays = calculatorDelivaryDays(distance);

        if (delivaryDays == -1) {
            System.out.println("Доставки нет");
        }
        else System.out.println("Потребуется дней: " + delivaryDays);

        System.out.println("TASK_2 Введите число: ");
        int sum = scanner.nextInt();
        System.out.println(sumOfDigits(sum));

        System.out.println("Write the first number: ");
        int numOne = scanner.nextInt();
        System.out.println("Write the second number: ");
        int numTwo = scanner.nextInt();

        System.out.println(" " + calculatorPower(numOne, numTwo));

    }

    public static int  calculatorDelivaryDays (int distance) {
        if (distance < 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else
            return -1;
    }

    /*Задача 2: Сумма цифр числа
Напишите метод, который принимает положительное целое число и возвращает сумму его цифр.
Например: Если цифра 234 сумма должна быть 9 (2+3+4)*/

    public static int sumOfDigits (int number) {
        String numberStr  = String.valueOf(number); //  int 234 ->  String "234"
        String[] array = numberStr.split(""); // [] {"2","3","4"}

        int sum = 0;
        for (String s : array) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }

    /*Задача 3: Возведение в степень
Напишите метод, который принимает два числа: основание и показатель степени, и возвращает результат возведения в степень.
Пример:
• Ввод: 2, 3
• Вывод: 8*/

public static int calculatorPower(int numOne, int numTwo) {

    int result =(int) Math.pow(numOne, numTwo);
    return result;
}

}