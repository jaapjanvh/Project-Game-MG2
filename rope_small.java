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
       test1();
     
        
    }
       int speed = 0;

       //&& getOneIntersectingObject(container1.class) == null
    
    public rope_small()
    {
         GreenfootImage image = getImage();  
        image.scale(1, 1);
        setImage(image); 
    }
    
    private void checkInput()
    {
        speed = 2;
        if(Greenfoot.isKeyDown("right")  )
        {
            move(speed);
            if (getOneIntersectingObject(container1.class) != null) 
            {move(-speed);}
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            move(-speed);
            if (getOneIntersectingObject(container1.class) != null) 
            {move(speed);
        }}
     
        
    }
    public void test1()
    {
      GreenfootImage image = getImage();
        if (Greenfoot.isKeyDown("down")) 
        { 
            MyWorld world = (MyWorld)getWorld();
            System.out.println("image: "+image.getHeight());
            System.out.println("hook: "+world.hook.getY());
            image.scale(1, world.hook.getY() );
            setLocation(getX(),world.hook.getY()/2);
            
           
        }
        
        if (Greenfoot.isKeyDown("up")) 
        { 
           MyWorld world = (MyWorld)getWorld();
            System.out.println("image: "+image.getHeight());
            System.out.println("hook: "+world.hook.getY());
            image.scale(1, world.hook.getY() );
            setLocation(getX(),world.hook.getY()/2);
        }  
    }
    
    
    
    public void test()
    
   
        {
        Actor hook; 
        hook = getOneIntersectingObject(hook.class); 
        //getOneObjectAtOffset(0, 0, hook.class);
        World world;
            int hookx;
            int hooky = 0;
            world = getWorld();
            hookx = hook.getX();
            hooky = hook.getY();
            GreenfootImage image = getImage();
        if (Greenfoot.isKeyDown("down")) 
        { 
            
            image.scale(5, (hooky));
            //setImage(image);
        }
        else if (Greenfoot.isKeyDown("up")) 
        { 
            image.scale(5, (hooky));
            setImage(image);
        }
        else
        {
            ;
        }
    }   
}
