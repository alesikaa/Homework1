package Homework1;

public class RectanglePerimeter {
    public static void main(String[] args) {
        /*
       task5:  write a program to print the area and perimeter of a rectangle with width=5 and height=8, and the program should say:
        "The perimeter of a rectangle with width and height __is equal to__and the area is__"
        The Perimeter of a rectangle with width 5.0 and height 8.0 is equal to 26.0 and the area is 40.0
         */
        double width=5.0;
        double height=8.0;
        System.out.println(width*height);
        System.out.println(2*(width+height));
        System.out.println("The Perimeter of a rectangle with width " +width+" and height " +height+ " is equal to " +((width+height)*2)+ " and the area is " +(width*height));

    }
}
