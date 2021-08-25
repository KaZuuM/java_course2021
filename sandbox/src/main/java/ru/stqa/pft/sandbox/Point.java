package ru.stqa.pft.sandbox;

public class Point {

    public double x;
    public double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public  double distance(Point this, Point b) {

        return Math.sqrt(Math.abs((b.x - this.x)) + Math.abs((b.y - this.y)));

    }
    // Выполнил решение со статичным методом
}
