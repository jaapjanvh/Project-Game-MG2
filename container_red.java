import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class container1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class container_red extends Actor
{
    /**
     * Act - do whatever the container1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     
 
         public void act() {
             c_move();
             //test();
            // temp();
        } 
 

    
    public container_red()
     /*
      * Resizes the image
      */
    {
        GreenfootImage image = getImage();  
        image.scale(100, 100);
        setImage(image);    
    }
    public void c_move()
     /*
      * When the hook touches the container and space is pressed and held, it will move with the hook until the spacebar is released.
      */
    
    {
        MyWorld world = (MyWorld)getWorld();
         if (getOneIntersectingObject(hook.class) != null  &&Greenfoot.isKeyDown("space") ) 
            { 
               setLocation(world.hook.getX(),world.hook.getY()+70);
            }
    }
    
    public void test()
    /*
      * testing with borders. Containers can go through each other. This should not be the case
      */
        {
        MyWorld world = (MyWorld)getWorld();
        if (getOneIntersectingObject(Container.class) == null)
        {
            if (getOneIntersectingObject(hook.class) != null  &&Greenfoot.isKeyDown("space") ) 
            { 
               setLocation(world.hook.getX(),world.hook.getY()+70);
            }
        }
        //else
        //{
        //    setLocation(getX(),getY());
        //}
    }
    
    public void temp()
    /*
     * container should not go through the "boat"
     */
    {
        MyWorld world = (MyWorld)getWorld();
    //if ( != null)
    {
        setLocation(getX(),getY());
    }
    }
}
