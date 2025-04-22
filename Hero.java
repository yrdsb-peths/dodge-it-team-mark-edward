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
        
        setLocation (500, currentY);

    }
}
