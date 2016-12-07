import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class container1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mover extends Actor
{
    private int acceleration = 0;
    private int vSpeed = 0;
    private int containerspeed = 0;  
    private Class[] barrier = new Class[0];
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
    
    public void doGravity()
    {
        if(vSpeed > 0) return;        
        if(vSpeed <= 0)  vSpeed = -1;
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    
    }
   
    protected void setMovementSpeed(int newSpeed)
    {
        containerspeed = newSpeed;
    }
    
    protected void setBlockingClasses(Class[] c)
    {
        barrier = c;
    }
    
    protected void setGravity(int g)
    {
        acceleration = g;
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
