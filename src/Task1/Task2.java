package Task1;



/*2 задание
Условие
Ограничение времени
5 секунд
Ограничение памяти
1024 МБ
У вас есть прямоугольник ﻿n ×mn×m﻿. Вы закрашиваете в нем максимально возможный по площади квадрат таким образом, чтобы
незакрашенная часть осталась связанным прямоугольником. После
этого вы берете новое ведро с краской и продолжаете закрашивание оставшейся части вышеописанным способом.
Сколько ведер с краской вам потребуется?

Например, если у вас есть прямоугольник ﻿3 ×4, то в нем можно закрасить квадрат ﻿ 3 ×3 таким образом, что оставшаяся часть займет
прямоугольник размером ﻿3×1﻿, который получится закрасить тремя квадратами. На весь процесс понадобится четыре ведра с краской.

Формат входных данных

Даны два натуральных числа ﻿n, m(1 <= n, m <= 10^{18})
 )﻿. Обратите внимание, что вам понадобится 64-битный тип данных для ввода.

Формат выходных данных

Выведите одно число ﻿-−﻿ количество ведер с краской.

Примеры данных
Пример 1
3 4
4
Пример 2
5 10
2
Решение*/

import java.util.Arrays;
import java.util.Scanner;
public class Task2 {

    private static final Scanner sc;

    static {
        sc = new Scanner(System.in);
    }
    public static void main(String[] args) {

        long[] values = getData();
        long count=0; //ведра
        if (values != null) {
            Arrays.sort(values);

            long n=values[0];
            long m=values[1];

           while(n!=m){

              long difference=m-n;
              ++count;
              m=difference;
              if(n>m){
                  long temp=n;
                  n=m;
                  m=temp;
              }
           }
           ++count;
            System.out.println(count);
            }

        }

    private static long[] getData() {
        if (sc.hasNext()) {
            String input = sc.nextLine();
            String[] inputValues = input.split(" ");
            long[] userData = new long[2];
            for (int i = 0; i < inputValues.length; i++) {
                userData[i] = Integer.parseInt(inputValues[i]);
            }
            return userData;
        }
        return null;
    }
}
