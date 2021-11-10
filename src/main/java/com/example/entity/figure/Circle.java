package com.example.entity.figure;

public class Circle implements Figure {

    /*
    1.
    Generate Constructor, getters and setters using `cmd + n`
    To implement getArea method, either generate it using `cmd + n`
    OR position your cursor on class definition and press `option + enter`

    2.
    Position cursor on the class definition. Press `option + enter` to generate a test class.
    Select `getArea` method in the context menu to generate the unit test for this class.

     3.
     Move this file to the right panel, so that the instructions stay visible.
     Position your cursor over `Figure` in class definition and press `cmd + b` to go to the interface.
     Press `option + enter` and choose `implement interface` and implement Triangle.

     4.
     Sometimes hierarchy grows a lot and it is hard to keep track of what classes actually implement the interface.
     To navigate to any subclass of `Figure` interface, position your cursor on class definition and press `option + cmd + b`.
     This will display all subclasses of `Figure` and will allow you to quickly navigate to them.
     */

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Code for Area: Math.PI * radius * radius;
}
