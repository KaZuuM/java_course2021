package ru.stqa.pft.sandbox;

public class FirstHomeWork {

    public static void main(String[] args) {

        Point first = new Point(1, 1);
        Point second = new Point(1, 2);
        System.out.println("Расстояние между 2-мя точками со значениями, которые ввёл пользователь = " + distance(first,second));
    }


    public static double distance(Point first, Point second) {

        return Math.sqrt(Math.abs((second.x - first.x)) + Math.abs((second.y - first.y)));

    }
    // Пример статичного метода
}


