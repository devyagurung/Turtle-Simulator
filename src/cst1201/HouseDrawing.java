/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst1201;

/**
 *
 * @author Devya
 */
public class HouseDrawing {

    /**
     * This method will draw house with 45 degree angle
     */
    public void draw() {
        double roofDistance = Math.sqrt(10000);

        Turtle myTurtle = new Turtle();
        myTurtle.forward(250);
        myTurtle.left(90);
        myTurtle.forward(250);
        myTurtle.left(90);
        myTurtle.forward(250);
        myTurtle.left(90);
        myTurtle.forward(250);

        myTurtle.left(180);
        myTurtle.penUp();
        myTurtle.forward(250);
        myTurtle.right(45);
        myTurtle.penDown();
        myTurtle.forward(roofDistance);
        myTurtle.right(90);
        myTurtle.forward(roofDistance);

    }
}
