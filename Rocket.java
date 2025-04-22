import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Rocket extends Actor
{
    public void act()
    {
        move(30);
        
        if (getX() >= 599) {
            resetRocket();
        }
        
        if (isTouching (Hero.class)) {
            Skull skull = new Skull();
            getWorld().addObject (skull, 300, 200);
            getWorld().removeObject(this);
            
            Actor hero = getOneIntersectingObject(Hero.class);
            getWorld().removeObject(hero);
           
        }
    }
    
    public void resetRocket() {
        int num = Greenfoot.getRandomNumber(2);
        if (num == 0) {
            setLocation (100,100);
        }
        else {
        setLocation (100,300);
    }
    }
}
