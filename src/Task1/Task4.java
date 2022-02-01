package Task1;
/*4 задание
Условие
Ограничение времени
5 секунд
Ограничение памяти
1024 МБ


Вы ﻿-−﻿ целеустремленный шахматный конь, который идет из левой нижней клетки доски до правой верхней, доска же имеет габариты ﻿n ×m﻿ клеток.

От вас требуется найти количество способов пройти через доску, если ваш конь ходит либо на две клетки вправо и одну наверх, либо на две клетки вверх и одну направо за ход.

Формат входных данных

На вход даются два натуральных числа ﻿n, m,(1 < n, m <= 50)

Формат выходных данных
Выведите одно число ﻿-−﻿ количество способов добраться конем до правого верхнего угла доски.
Если добраться до правого верхнего угла доски невозможно, выведите ﻿«0»«0»﻿
Примеры данных
Пример 1
4 4
2
Решение*/


import java.util.Objects;
import java.util.Scanner;

    public class Task4 {

        private static final Scanner sc;

        static {
            sc = new Scanner(System.in);
        }

        public static void main(String[] args)

        {
            int[] userInput = Objects.requireNonNull(getData(2));
            int n = userInput[0];
            int m = userInput[1];

            if (n * m < 6) {
                System.out.println(0);
            } else {
                long[][] dp = new long [n+1][m+1];
                dp[1][1] = 1;
                for (int i = 2; i <= n; i++)
                    for (int j = 2; j <= m;j ++)
                        dp[i][j] = dp[i-1][j-2] + dp[i-2][j-1];

                System.out.println(dp[n][m]);
            }

        }

        private static int[] getData(int n) {
            if (sc.hasNext()) {
                String input = sc.nextLine();
                String[] inputValues = input.split(" ");
                int[] userData = new int[n];
                for (int i = 0; i < inputValues.length; i++) {
                    userData[i] = Integer.parseInt(inputValues[i]);
                }
                return userData;
            }
            return null;
        }
    }
