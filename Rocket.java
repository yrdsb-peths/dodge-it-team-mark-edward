import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Rocket extends Actor
{
    public void act()
    {
        move(10);
        
        if (getX() >= 599) {
            resetRocket();
        }
        
        if (isTouching (Hero.class)) {
            Rocket rocket = new Rocket();
            getWorld().addObject (rocket, 100, 100);
            getWorld().removeObject(this);
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
