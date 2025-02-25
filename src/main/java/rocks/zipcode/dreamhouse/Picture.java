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
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        wall = new Square();
        wall.changeColor("grey");
        wall.moveVertical(200);
        wall.changeSize(100);
        wall.makeVisible();
        wall.moveHorizontal(160);

        wall = new Square();
        wall.changeColor("grey");
        wall.moveVertical(200);
        wall.changeSize(100);
        wall.makeVisible();
        wall.moveHorizontal(-120);


        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(55);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("orange");
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("white");
        sun.moveHorizontal(45);
        sun.moveVertical(-60);
        sun.changeSize(60);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("grey");
        sun.moveHorizontal(45);
        sun.moveVertical(-60);
        sun.changeSize(50);
        sun.makeVisible();

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(55);
        window.moveVertical(200);
        window.makeVisible();

        window = new Square();
        window.changeColor("grey");
        window.moveHorizontal(55);
        window.moveVertical(190);
        window.makeVisible();

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(40);
        window.moveVertical(180);
        window.makeVisible();

        window = new Square();
        window.changeColor("grey");
        window.moveHorizontal(40);
        window.moveVertical(170);
        window.makeVisible();

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
