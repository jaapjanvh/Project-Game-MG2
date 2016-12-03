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
    public container container;
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
        //        hook.setLocation(731,76);        
        addObject(hook,90,60);
        rope_small rope_small = new rope_small();
        addObject(rope_small,98,0);
        rope_small rope_small2 = new rope_small();
        addObject(rope_small2,82,0);
        crane crane = new crane();
        addObject(crane,271,25);
        container container1 = new container();
        addObject(container1,60,500);
        container container2 = new container();
        addObject(container2,160,500);        
        container container3 = new container();
        addObject(container3,260,500);
        boat boat = new boat();
        addObject(boat,219,650);

    }
}
