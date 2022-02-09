package com.company;

import java.util.ArrayList;
//creating class Shape
public class Shape {
    ArrayList<Point> pointArrayList;
    ArrayList<Double> pointDistance;
    private static int id_gen=0;
    private int id;
    public Shape(){
        id=id_gen++;
        pointArrayList = new ArrayList<>();
        pointDistance = new ArrayList<>();
    }

    //creating addPoint function that accepts a Point and add it to a field points
    public void addPoint(Point point){
        pointArrayList.add(point);
    }

    public ArrayList<Point> getPointArrayList() {
        return pointArrayList;
    }

    //creating getPoint that return points
    public Point getPoint(int index){
        return pointArrayList.get(index);
    }

    //creating "calcDistance" function to calculate distance between points
    public void calcDistance(){
        int size = pointArrayList.size();
        for (int i = 0; i < size-1; i++) {
            pointDistance.add(i,pointArrayList.get(i).distance(pointArrayList.get(i+1)));
        }
        pointDistance.add(size-1,pointArrayList.get(size-1).distance(pointArrayList.get(0)));
    }

    //creating "calcPerimeter" function to calculate the perimeter of the shape
    public double calcPerimeter(){
        if(pointDistance.size()==0)
            calcDistance();
        double sum=0;
        for (int i=0; i<pointDistance.size();i++) {
            sum+=pointDistance.get(i);
        }
        return sum;
    }

    //creating function "getLongestSide" to return longest side of the shape
    public double getLongestSide() {
        double longest = pointDistance.get(0);
        int size=pointDistance.size();
        for(int i=0; i<size; i++) {
            if(longest<pointDistance.get(i)) {
          longest=pointDistance.get(i);
        }
    }
        return longest;
    }

    //creating function "getAverageLength" to return average length of all sides
    public double getAverageLength() {
    double average=0;
    average=calcPerimeter()/pointDistance.size();
    return average;
    }
}
