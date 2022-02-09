package com.company;
//creating class Point
public class Point {//class Point contain two fields with x and y
    private int x;
    private int y;
    //creating a constructor that accepts two arguments x and y
    public Point(int x, int y){
        setX(x);
        setY(y);
    }
    //creating setter and getter functions for x and y
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    //creating function distance that accepts another point and return the distance between two points
    public double distance(Point point){
        return Math.sqrt(Math.pow(getX()-point.getX(),2)+Math.pow(getY()- point.getY(),2));
    }
}