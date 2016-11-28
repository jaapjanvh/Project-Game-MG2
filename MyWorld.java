import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public hook hook;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 750, 1); 
        prepare();
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        hook = new hook();
        addObject(hook,573,66);
        container1 container1 = new container1();
        addObject(container1,850,471);
        container1.setLocation(921,313);
        container1.setLocation(711,581);
        hook.setLocation(731,76);
        hook.setLocation(711,80);
        rope_small rope_small = new rope_small();
        addObject(rope_small,708,0);
        rope_small rope_small2 = new rope_small();
        addObject(rope_small2,717,0);
        rope_small.setLocation(700,49);
        hook.setLocation(710,78);
    }
}
