package ru.stqa.pft.sandbox;

public class Point {

    public double x;
    public double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point a, Point b) {

        return Math.sqrt(Math.abs((b.x - a.x)) + Math.abs((b.y - a.y)));

    }
    // Выполнил решение со статичным методом
}
