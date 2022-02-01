package Task1;
/*5 задание
Условие
Ограничение времени
5 секунд
Ограничение памяти
1024 МБ
Лягушонок Линк решил забраться на гору высотой n метров во время дождя. Поскольку в дождь горы скользкие, то после каждого прыжка Линк соскальзывает на некоторое расстояние вниз.
 Более формально, если Линк делает прыжок, будучи на расстоянии ﻿i метров от вершины, то он может
  прыгнуть на любую высоту от ﻿0 до ﻿ai дополнительных метров наверх.
  Но схватившись за скалу на расстоянии ﻿j﻿ метров от вершины, Линк проскользит вниз на ﻿bj метров.

От вас требуется определить минимальное количество прыжков, которое потребуется Линку для подъема наверх.

Формат входных данных
В первой строке задано целое положительное число ﻿n﻿ ﻿(1 <= n <= 300000)−﻿ высота горы.

Во второй строке задано ﻿n﻿ целых чисел ﻿a_{1}, a_{2}, a_{n}  (0 <= a_{i} <= i)−﻿ максимальная высота,
 доступная для прыжка на заданном расстоянии от вершины.

В третьей строке вводится ﻿nn﻿ целых чисел ﻿b_{1}, b_{2}, b_{n}( 0<= b_{i}<=  n-i) количество метров, которые лягушонок
проскользит вниз, приземлившись на расстоянии ﻿i﻿ от вершины.

Формат выходных данных

В первой строке выведите целое число ﻿k﻿ ﻿−﻿ минимально возможное количество прыжков.
 В случае, если Линк не сможет добраться до верха горы, выведите ﻿-1﻿.

Замечание

В первом тесте из условия Линк за один прыжок поднимается к отметке на расстоянии ﻿1﻿ метр от вершины.
После этого он соскальзывает вниз на метр. Следующим прыжком он запрыгнет на гору.

Примеры данных
Пример 1
3
0 2 2
1 1 0

2
Пример 2
2
1 1
1 0
вывод
-1
Пример 3
10
0 1 2 3 5 5 6 7 8 5
9 8 7 1 5 4 3 2 0 0
вывод
3
Решение*/

public class Task5 {
}