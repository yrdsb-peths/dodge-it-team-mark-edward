import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Rocket extends Actor
{
    public void act()
    {
        move(10);
        
        if (getX() <=0) {
            resetBread();
        }
        
        if (isTouching (Hero.class)) {
            Rocket rocket = new Rocket();
            getWorld().addObject (rocket, 100, 100);
            getWorld().removeObject(this);
        }
    }
    
    public void resetBread() {
        int num = Greenfoot.getRandomNumber(2);
        if (num == 0) {
            setLocation (500,100);
        }
        else {
        setLocation (500,300);
    }
    }
}
