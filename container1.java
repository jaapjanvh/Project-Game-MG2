import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class container1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class container1 extends Actor
{
    /**
     * Act - do whatever the container1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     
 
         public void act() {
             test();
           
        } 
 

    
    public container1()
     /*
      * Resizes the image
      */
    {
        GreenfootImage image = getImage();  
        image.scale(100, 100);
        setImage(image);    
    }
    public void test()
    /*
      * When the hook touches the container and space is pressed and held, it will move with the hook until the spacebar is released.
      */
   
        {
        Actor hook; 
        hook = getOneIntersectingObject(hook.class); 
        //getOneObjectAtOffset(0, 0, hook.class);
        if (hook != null  &&Greenfoot.isKeyDown("space") ) 
        { 
            World world;
            int hookx;
            int hooky;
            world = getWorld();
            hookx = hook.getX();
            hooky = hook.getY();
            setLocation(hookx,hooky+60);
        }
    } 

    
}
