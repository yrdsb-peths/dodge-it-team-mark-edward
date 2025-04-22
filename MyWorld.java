import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Hero hero = new Hero();
        addObject(hero, 500, 100);
        
        Rocket rocket = new Rocket();
        addObject (rocket, 100, 100);
    }
}
