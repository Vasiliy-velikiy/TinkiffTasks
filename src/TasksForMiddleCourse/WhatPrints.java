package TasksForMiddleCourse;

public class WhatPrints {
    //Что будет выведено после выполнения кода:
//        int k = 0;
//        for (int i = 0; i < 10; i++) {
//            k = k++;
//        }
//        System.out.println(k);


//Что будет выведено после выполнения кода:
//        List<String> numbers = new ArrayList(Arrays.asList("first", "second", "third"));
//        for (String number : numbers) {
//            if ("third".equals(number)) {
//                numbers.add("fourth");
//            }
//        }
//        System.out.println(numbers.size());

        /*Какова фактическая сложность поиска элемента в множестве, объявленном следующим образом?:

class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        return 31;
    }
}

Set<Point> points = Stream.of(
        new Point(2, 7),
        new Point(5, 4),
        new Point(5, 4),
        new Point(4, 5),
        new Point(3, 6)
).collect(Collectors.toCollection(HashSet::new));;

points.contains(new Point(2, 7));*/
}
