package com.company;

        import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.Scanner;

//creating class AssignmentOne
public class AssignmentOne {

    public static void main(String[] args) throws FileNotFoundException {
        //inputting files with points
        Scanner sc1 = new Scanner(new File("C:/Users/Asus/Desktop/file1.txt"));
        Scanner sc2 = new Scanner(new File("C:/Users/Asus/Desktop/file2.txt"));
        int x, y;

        Shape firstshape = new Shape();
        //creating while statement to add points from the first file
        while(sc1.hasNextLine()) {
            x = sc1.nextInt();
            y = sc1.nextInt();
            Point point1=new Point(x, y);
            firstshape.addPoint(point1);
        }
        //printing perimeter, longest side and average length of the first shape
        System.out.println("First shape: ");
        System.out.println("The perimeter of the first shape is: "+firstshape.calcPerimeter());
        System.out.println("The longest side of the first shape is: "+firstshape.getLongestSide());
        System.out.println("The average length of the first shape is: "+firstshape.getAverageLength());

        Shape secondshape = new Shape();
        //creating while statement to add points from the second file
        while(sc2.hasNextLine()) {
            x = sc2.nextInt();
            y = sc2.nextInt();
            Point point2=new Point(x, y);
            secondshape.addPoint(point2);
        }
        //printing perimeter, longest side and average length of the second shape
        System.out.println("Second shape: ");
        System.out.println("The perimeter of the second shape is: "+secondshape.calcPerimeter());
        System.out.println("The longest side of the second shape is: "+secondshape.getLongestSide());
        System.out.println("The average length of the second shape is: "+secondshape.getAverageLength());
    }
}