package rocks.zipcode.dreamhouse;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {


        sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(125);
        sun.moveVertical(145);
        sun.changeSize(45);
        sun.makeVisible();



        wall = new Square();
        wall.changeColor("white");
        wall.moveVertical(170);
        wall.moveHorizontal(100);
        wall.changeSize(70);
        wall.makeVisible();



        roof = new Triangle();
        roof.changeColor("black");
        roof.changeSize(40, 120);
        roof.moveHorizontal(190);
        roof.moveVertical(135);
        roof.makeVisible();

        wall = new Square();
        wall.changeColor("white");
        wall.moveVertical(170);
        wall.moveHorizontal(150);
        wall.changeSize(70);
        wall.makeVisible();

        wall = new Square();
        wall.changeColor("white");
        wall.moveVertical(140);
        wall.moveHorizontal(150);
        wall.changeSize(70);
        wall.makeVisible();


        wall = new Square();
        wall.changeColor("white");
        wall.moveVertical(170);
        wall.moveHorizontal(60);
        wall.changeSize(70);
        wall.makeVisible();


        sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(20);
        sun.moveVertical(-97);
        sun.changeSize(60);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(0);
        sun.moveVertical(-95);
        sun.changeSize(60);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(-10);
        sun.moveVertical(-90);
        sun.changeSize(60);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(-25);
        sun.moveVertical(-90);
        sun.changeSize(60);
        sun.makeVisible();



        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(215);
        sun.moveVertical(-55);
        sun.changeSize(60);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(100);
        sun.moveVertical(-55);
        sun.changeSize(10);
        sun.makeVisible();



        sun = new Circle();
        sun.changeColor("blue");
        sun.moveHorizontal(112);
        sun.moveVertical(-25);
        sun.changeSize(10);
        sun.makeVisible();


        sun = new Circle();
        sun.changeColor("grey");
        sun.moveHorizontal(215);
        sun.moveVertical(-55);
        sun.changeSize(50);
        sun.makeVisible();

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(155);
        window.moveVertical(145);
        window.makeVisible();


        window = new Square();
        window.changeColor("grey");
        window.moveHorizontal(155);
        window.moveVertical(190);
        window.makeVisible();

        window = new Square();
        window.changeColor("grey");
        window.moveHorizontal(70);
        window.moveVertical(190);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(-60);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(-40);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(-25);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(-10);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(5);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(15);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(25);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(35);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(45);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(60);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(75);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(90);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(110);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(120);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(135);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(155);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(165);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(175);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(190);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(210);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(225);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(245);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(260);
        roof.moveVertical(270);
        roof.makeVisible();

        roof = new Triangle();
        roof.changeColor("green");
        roof.changeSize(40, 120);
        roof.moveHorizontal(275);
        roof.moveVertical(270);
        roof.makeVisible();





    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("grey");
            sun.changeColor("yellow");
        }
    }

}
