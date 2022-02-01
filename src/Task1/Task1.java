package Task1;


/*1 задание
Условие
Ограничение времени
5 секунд
Ограничение памяти
1024 МБ
Васе дали два числа ﻿A﻿, ﻿B﻿. Ему кажется, что эти числа были получены из некоторого натурального числа с помощью прибавления и вычитания ﻿nn﻿ натуральных чисел (не обязательно одинаковых).

Причем к ﻿A﻿ все загаданные числа прибавлялись, а из ﻿B﻿ вычитались. Более конкретно:

﻿A=X+x1+x2+...+xn;
﻿B=X=x1-x2-...-xn;

 ﻿
Вам интересно, подходят ли какие-то натуральные числа﻿-−﻿﻿X, x1, ...xn
​
 ﻿ под Васину гипотезу.ам , подходят ли какие-то натуральные x
Формат входных данных

На вход подаются три целых числа через пробел

﻿A, B, n (0 <= A, B, n <=t 10^{9})

Формат выходных данных

Выведите «YES», если Васина гипотеза верна и «NO», иначе

Замечание

В данной задаче ﻿0﻿ не является натуральным числом.

Примеры данных
Пример 1
3 5 1
NO
Пример 2
5 3 1
YES
Решение*/

import java.util.Scanner;
public class Task1 {
        private static final Scanner sc;

        static {
            sc = new Scanner(System.in);
        }

        public static void main(String[] args) {
            int[] values = getData();
            if (values != null) {
                int a = values[0];
                int b = values[1];
                int n = values[2];
                int sum = (n * (n + 1)) / 2;
                int avg = (a + b) / 2;
                int deltaA = a - avg;
                int deltaB = avg - b;
                if (avg < a && avg > b && deltaA == deltaB && deltaA == sum && deltaB == sum) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

        private static int[] getData() {
            if (sc.hasNext()) {
                String input = sc.nextLine();
                String[] inputValues = input.split(" ");
                int[] userData = new int[3];
                for (int i = 0; i < inputValues.length; i++) {
                    userData[i] = Integer.parseInt(inputValues[i]);
                }
                return userData;
            }
            return null;
        }
    }

