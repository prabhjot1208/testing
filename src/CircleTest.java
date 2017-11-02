/*
 * TCSS 305
 * Assignment 1 - Testing
 */
import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Point;

import org.junit.Before;
import org.junit.Test;
/** 
 * This is test using JUnit for Circle class.
 * 
 * @author Prabhjot Singh
 * @version 1.0
 */
public class CircleTest {

    /**A tolerance used when comparing double values. */
    private static final double TOLERANCE = .000001;

    /**Object for circle. */
    private Circle myCircle;

    /**Runs the Circle() constructor test.*/
    @Before
    public void setUp() {
        myCircle = new Circle();
        assertNotNull(myCircle);
    }

    /**
     * Test for the default Constructor.
     */
    @Test
    public void testCircle() {
        final Circle firstCircle = new Circle();
        assertNotNull(firstCircle);
    }


    /**
     * Runs for the circle constructor with parameters to check for the exception.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testCircleException() {
        final Circle exceptionCircle = new Circle(-10.0, new Point(2, 3), Color.RED);
        assertNull(exceptionCircle);
    }

    /**
     * Checks if the constructors radius value is negative.
     */ 
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorRadiusIllegal() {
        myCircle.setRadius(-10.0);
    }

    /**
     * Checks if the constructors center is null.
     */
    @Test(expected = NullPointerException.class)
    public void testConstructorCenterNull() {
        myCircle.setCenter(null);
    }


    /**
     * Checks if the constructors color is null.
     */
    @Test(expected = NullPointerException.class)
    public void testConstructorColorNull() {
        myCircle.setColor(null);
    }


    /** 
     * Runs the getRadius() method test.
     */
    @Test
    public void testGetRadius() {
        assertEquals("Radius was created incorrectly!", 1.00,
                     myCircle.getRadius(), TOLERANCE);
    }

    /** 
     * Runs the getCenter() method test.
     */
    @Test
    public void testGetCenter() {  
        assertEquals("Center was created incorrectly", new Point(0, 0)
                     , myCircle.getCenter());
    }

    /** 
     * Runs the getColor() method test.
     */
    @Test
    public void testGetColor() {  
        assertEquals("Color was created incorrectly", Color.BLACK
                     , myCircle.getColor());
    }

    /** 
     * Runs the setRadius() method test.
     */
    @Test
    public void testSetRadius() {
        myCircle.setRadius(2);
        assertEquals("Circle Constructor creates the radius incorrectly", 2,
                     myCircle.getRadius(), TOLERANCE);
    }

    /**
     * Checks if the value of radius is negative.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRadiusIllegal() {
        myCircle.setRadius(-10.0);
    }

    /** 
     * Runs the setCenter() method test.
     */
    @Test
    public void testSetCenter() {
        myCircle.setCenter(new Point(1, 1));
        assertEquals("Circle Constructor creates the center incorrectly", new Point(1, 1),
                     myCircle.getCenter());
    }

    /**
     * Checks if the center is null.
     */
    @Test(expected = NullPointerException.class)
    public void testSetCenterNull() {
        myCircle.setCenter(null);
    }

    /** 
     * Runs the setColor() method test.
     */
    @Test
    public void testSetColor() {
        myCircle.setColor(Color.CYAN);
        assertEquals("Circle Constructor creates the color Incorectly", Color.CYAN,
                     myCircle.getColor());
    }

    /**
     * Checks if the color is null.
     */
    @Test(expected = NullPointerException.class)
    public void testSetColorNull() {
        myCircle.setColor(null);
    }

    /** 
     * Runs the calculateDiameter() method test.
     */
    @Test
    public void testCalculateDiameter() {
        myCircle.setRadius(2);
        assertEquals("CalculateDiameter fails to return the diameter", 4, 
                     myCircle.calculateDiameter(), TOLERANCE);
    }
    /** 
     * Runs the calculateCircumference() method test.
     */
    @Test
    public void testCalculateCircumference() {
        myCircle.setRadius(2);
        assertEquals("CalculateCircumference fails to retun the circumference of circle",
                     2 * Math.PI * 2, myCircle.calculateCircumference(), TOLERANCE);

    }
    /** 
     * Runs the calculateArea() method test.
     */
    @Test
    public void testCalculateArea() {
        myCircle.setRadius(4);
        assertEquals("calculateArea fails to return the area of circle", Math.PI * 4 * 4,
                     myCircle.calculateArea(), TOLERANCE);
    }

    
    /** 
     * Runs the toString() method test.
     */
    @Test
    public void testToString() {
        assertEquals("Produced an unexpected result!", "Circle [radius=1.00, "
                        + "center=java.awt.Point[x=0,y=0], color=java.awt.Color[r=0,g=0,b=0]]",
                        myCircle.toString());
    }

}


