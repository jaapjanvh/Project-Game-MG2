import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class truck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class truck extends Actor
{
    private int vTemp = 0;
    private int vRandom =  Greenfoot.getRandomNumber(3);
    /**
     * Act - do whatever the truck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
     {
         load_vehicle();
         touchcontainer();
        }
    
    /**
     * If a container touches the vehicle (this actor) it changes the actor to another color
     */
    public void load_vehicle() 
    {
        MyWorld world = (MyWorld)getWorld();
        GreenfootImage image = getImage();
        image.scale(22, 60);
        //System.out.println("Stuff" + vRandom);
        if (vTemp == 0 && vRandom == 0) 
        {
          setImage("Truck_red.png");
          world.addObject(this, 120, 199);
        }
        if (vTemp == 0 && vRandom == 1)
        {
          //GreenfootImage image = getImage()
          setImage("Truck_blue.png");
          image.scale(1, 60);
          world.addObject(this, 120, 100);
        }
        if (vTemp == 0 && vRandom == 2)
        {
          // GreenfootImage image = getImage();  
          image.scale(22, 60);
          setImage("Truck_green.png");
          world.addObject(this, 120, 100);
        }
    }
    
    /**
     * If a container touches the vehicle (this actor) it deletes the container from the world.
     */
    public void touchcontainer()
    {
       MyWorld world = (MyWorld)getWorld();
       Actor b = getOneIntersectingObject(Container.class);  
      
         if(b != null)  
         {  
          getWorld().removeObject(b);   
          //getWorld().removeObject(this);
          vRandom =  Greenfoot.getRandomNumber(3);
       }
    }
}
