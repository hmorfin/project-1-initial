package com.csc205.project1;

/**
 * The prompt I used for Chat-GPT is as follows: Design & implement a class called Point that
 * represents a location in the Cartesian plane.
 * Include (at a minimum) the following methods:
 * setX(double x), setY(double y), setPoint(double x, double y) - set the coordinates of the point.
 * shiftX(double n), shiftY(double n) - shift a point by a given amount along one of the axes.
 * distance(Point p2) - finds the distance to point p2.
 * rotate(double angle) - rotates the point by a specified angle around the origin.
 * The formula for rotation is as follows:
 *
 *
 * Any other methods you believe to be necessary.
 *
 * The code that the AI gave me initially did not work properly,
 * for example I could not find a way to modify the class Point so when
 * Project 1 runs it shows X:etc, Y:etc.
 * After googling through the code, I found a better way to modify the original code of
 * the AI to better fit the needs of this Project.
 *
 */

public class Point {

        // Variables of the class
        private double x,y;

        // Default Constructor
        public Point() {
            x = 0;
            y = 0;
        }


    // Parameterized Constructor
        public Point(double x,double y){
            this.x = x;
            this.y = y;
        }

        // Find distance between the stored point and provided point
        // Using the distance between two points formula
        public double distance(Point p){
            double dist = Math.sqrt( Math.pow((this.x-p.getX()),2)+Math.pow((this.y-p.getY()),2));
            return dist;
        }

        // Getter for X
        public double getX() {
            return x;
        }

        // Setter for X
        public void setX(double x) {
            this.x = x;
        }

        // Getter for Y
        public double getY() {
            return y;
        }

        // Setter for Y
        public void setY(double y) {
            this.y = y;
        }

        // Change the values of Private variables x and y with new values
        public void setPoint(double new_x, double new_y){
            this.x = new_x;
            this.y = new_y;
        }

        // Shifting x by distance provided in parameter
        public void shiftX(double dist){
            this.x+=dist;
        }

        // Shifting y by distance provided in parameter
        public void shiftY(double dist){
            this.y+=dist;
        }

        // Rotating the point , by given angle provided in radians
        public void rotate(double radian){
            this.x = (x*(Math.cos(radian)))-(y*(Math.sin(radian)));
            this.y = (x*(Math.sin(radian)))+(y*(Math.cos(radian)));
        }

        // Overriding the toString implementation for Point class
        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
}
