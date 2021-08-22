package ru.stqa.pft.sandbox;

public class FirstHomeWork {

    public static void main(String[] args) {

        Point first = new Point(2, 1);
        Point second = new Point(3, 5);
        System.out.println("Расстояние между 2-мя точками со значениями, который ввёл пользователь = " + first.distance(second));


        //Итоговый вид, для первого объекта точка вызываем метод, который рассчитает расстояние до 2-ой.

    }


    public static double distance(Point first, Point second) {

        return Math.sqrt(Math.abs((second.x - first.x)) + Math.abs((second.y - first.y)));

    }
    // Пример статичного метода
}


