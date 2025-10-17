import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bat extends Actor
{
    /**
     * Act - do whatever the Bat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speedBat = 3;
    String currImage = "bat_01.png";
    public void act()
    {
        if (currImage == "bat_01.png") {
            currImage = "bat_02.png";
            setImage(currImage);
        } else {
            currImage = "bat_01.png";
            setImage(currImage);
        }
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null) {
            turnTowards(mouse.getX(), mouse.getY());  
            move(speedBat);
            turnTowards(getX(), getY());
        }
    }
}
