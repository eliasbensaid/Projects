import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BananaWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     * 
     */
    public void act(){
        int n = Greenfoot.getRandomNumber(100);   
        if (n == 1) {
            Banana banana = new Banana();
            addObject(banana, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
    }
    public BananaWorld(){    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        setBackground("space1.jpg");
        Bat bat = new Bat();
        addObject(bat, getWidth()/2, getHeight()/2);
    
    }
}
