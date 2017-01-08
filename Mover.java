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
    public static boolean vmg2_containerdown;
    public static boolean vmg2_containerup;
    public static boolean vmg2_containerright;
    public static boolean vmg2_containerleft;
    public boolean vmg2_right;
    public boolean vmg2_left;    
    public void c_move()
    /*
     * When the hook touches the container and space is pressed and held, it will move with the hook until the spacebar is released.
     */

    {
        MyWorld world = (MyWorld)getWorld();
        if (getOneIntersectingObject(hook.class) != null  &&Greenfoot.isKeyDown("space")) 
        { 
            setLocation(world.hook.getX(),world.hook.getY()+40);
        }
    }

    public void mg2_MoveCont()
    {
        MyWorld world = (MyWorld)getWorld();
        GreenfootImage image = getImage(); 
        if (world.hook.vmg2_hooked == true && getOneIntersectingObject(hook.class) != null)
        {
            setLocation(world.hook.getX(),world.hook.getY()+40);  
            //if (getOneObjectAtOffset(+image.getWidth()/2,0, null) == null && getOneObjectAtOffset(-image.getWidth()/2,0, null) == null)
            //{
            //    setLocation(world.hook.getX(),world.hook.getY()+40);  
            //}
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

    public void canmove_container()
    {
        GreenfootImage image = getImage(); 
        if (getOneObjectAtOffset(0, image.getHeight()/2,null) == null) 
        {
            vmg2_containerdown= true;
        }
        else
        {
            vmg2_containerdown = false;
        }
    }

    public void mg2_ContCanMove()
    {
        GreenfootImage image = getImage(); 
        if (getOneObjectAtOffset(+image.getWidth()/2,0, null) == null) 
        {
            vmg2_right= true;
        }
        else  
        {
            vmg2_right = false;
        }
        if (getOneObjectAtOffset(-image.getWidth()/2,0, null) == null) 
        {
            vmg2_left= true;
        }
        else  
        {
            vmg2_left = false;
        }
    }

}
