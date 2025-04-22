import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Hero extends Actor
{
    int currentY = 100;
    
    boolean atTop = true;
    public void act()
    {
        if (Greenfoot.isKeyDown("down")) {
            currentY += 10;
        }
        
        if (Greenfoot.isKeyDown("up")) {
            currentY -= 10;
        }
        
<<<<<<< HEAD
        setLocation (500, currentY);
=======
    
>>>>>>> d3b0b53c1a25034b689b3473b59c9de2d9c58e2c
    }
}
