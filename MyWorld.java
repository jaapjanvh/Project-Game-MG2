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
    //public Container Container;
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
        addObject(new Container(), 60, 500);
        /*
        Container Container2 = new Container();
        addObject(Container2,160,500);        
        Container Container3 = new Container();
        addObject(Container3,260,500);
        */
        boat boat = new boat();
        addObject(boat,220,650);
        container_red container_red = new container_red();
        addObject(container_red,365,500);
    }
    
}
