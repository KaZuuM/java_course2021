package ru.stqa.pft.sandbox;

public class Point {

    public double x;
    public double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point this, Point second) {

        return Math.sqrt(Math.abs((second.x - this.x)) + Math.abs((second.y - this.y)));

    }
    // Идея подсказала что необходимо убрать static в сигнатуре метода, чтобы он так заработал. Если есть ещё варианты
    // Могу подумать как решить
}
