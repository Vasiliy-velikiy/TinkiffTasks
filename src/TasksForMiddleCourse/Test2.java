package TasksForMiddleCourse;

/*2 задание
Условие
Ограничение времени
1 секунда
Ограничение памяти
256 МБ
Последние 5 лет Мирон не пользовался интернетом, за это время появились множество криптовалют.
 Мирон, будучи предприимчивым человеком, за неделю получил $1000 на альткоинах, и решил вывести их, но вот незадача: кроме криптовалют появилось
  множество интернет-мошенников. Мирон решил не экономить на безопасности, и для установления надежного соединения с обменником хочет передать данные
  через цепочку серверов.

Всего доступно n серверов, изначально данные находятся на сервере 1, и их необходимо передать n. С сервера под номером i можно передать данные на любой сервер с
номером от i+1 до i+k (но не больше чем n). Некоторые сервера являются небезопасным, и через них Мирон категорически не хочет передавать свои данные.
 Помогите Мирону понять, сможет ли он осуществить транзакцию, используя только безопасные сервера.

Формат входных данных

В первой строке входных данных записаны два целых числа  n, k(1<=t n,k <= 300 000) - количество серверов и дальность передачи, соответственно.

Во второй строке входных данных записана строка s длины n, где i-й символ равен 1, если сервер под номером i является безопасным, и 0 в противном случае.

Гарантируется, что сервера 1 и n безопасны.



Формат выходных данных

В единственной строке выведите слово YES, если можно осуществить транзакцию, и NO в противном случае.

Примеры данных
Пример 1
2 1
11
YES
Пример 2
5 2
10101
YES
Пример 3
8 4
11000011
NO
Решение*/

import java.util.Scanner;

public class Test2 {
    public static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        String sк = scanner.nextLine();
        String[] strings = sк.split(" ");

        int amountOfServer = Integer.parseInt(strings[0]); //количество серверов

        int rangeOfTransmission = Integer.parseInt(strings[1]); //дальность передачи

        String s = scanner.nextLine(); //порядок серверов безопасный не безопасный
        int shag = amountOfServer - 1;

        for (int i = 0; i < amountOfServer; ) {

            if (i + 1 == amountOfServer) {
                break;
            }

            if (i + rangeOfTransmission < amountOfServer) {
                if ((s.charAt(i) == '1' && s.charAt(i + rangeOfTransmission) == '1')) {
//                  /System.out.println("jump");
                    shag = shag - rangeOfTransmission;
                    i = i + rangeOfTransmission;
                } else if ((s.charAt(i) == '1' && s.charAt(i + 1) == '1')) {
                    //System.out.println("jump");
                    shag = shag - 1;
                    i = i + 1;

                } else {
                    break;
                }
            }

        }
        if (shag == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}


