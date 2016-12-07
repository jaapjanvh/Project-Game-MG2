import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rope here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rope_small extends Actor
{
    /**
     * Act - do whatever the rope wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkInput();
       //test1();
     
        
    }
       int speed = 0;

       //&& getOneIntersectingObject(container1.class) == null
    
    public rope_small()
    {
         GreenfootImage image = getImage();  
        image.scale(2, 2);
        setImage(image); 
    }
    
    private void checkInput()
    {
        speed = 2;
        if(Greenfoot.isKeyDown("right")  )
        {
            move(speed);
            //if (getOneIntersectingObject(container1.class) != null) 
            //{move(-speed);}
        }
        if(Greenfoot.isKeyDown("left"))
        {
            move(-speed);
            //if (getOneIntersectingObject(container1.class) != null) 
            //{move(speed);
              
        }
        GreenfootImage image = getImage();
        if (Greenfoot.isKeyDown("down")) 
        { 
            MyWorld world = (MyWorld)getWorld();
            image.scale(2, world.hook.getY() );
            setLocation(getX(),world.hook.getY()/2+speed);
           
        }
        
        if (Greenfoot.isKeyDown("up")) 
        { 
           MyWorld world = (MyWorld)getWorld();
            image.scale(2, world.hook.getY() );
            setLocation(getX(),world.hook.getY()/2+speed);
        }
     
        
    }
}
