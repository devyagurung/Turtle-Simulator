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
public class InitialDrawing {

    /**
     * Drawing
     */

    public void draw() {
        Turtle myTurtle = new Turtle();
        myTurtle.setPenColor("Green");
        myTurtle.left(90);
        myTurtle.penUp();
        myTurtle.forward(300);
        myTurtle.penDown();
        myTurtle.right(135);
        myTurtle.forward(425);
        myTurtle.left(135);
        myTurtle.forward(300);
        myTurtle.left(135);
        myTurtle.forward(425);

        myTurtle.setPenColor("Blue");
        myTurtle.left(60);
        myTurtle.penUp();
        myTurtle.forward(200);
        myTurtle.penDown();
        myTurtle.right(135);
        myTurtle.forward(325);
        myTurtle.left(60);
        myTurtle.forward(200);
        myTurtle.right(180);
        myTurtle.forward(200);
        myTurtle.left(135);
        myTurtle.forward(225);

        myTurtle.setPenColor("Black");
        myTurtle.right(80);
        myTurtle.penUp();
        myTurtle.forward(180);
        myTurtle.right(135);
        myTurtle.forward(325);
        myTurtle.left(140);
        myTurtle.penDown();
        myTurtle.forward(200);
        myTurtle.right(180);
        myTurtle.forward(200);
        myTurtle.left(135);
        myTurtle.forward(225);
    }

}
