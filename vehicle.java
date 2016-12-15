import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class vehicle extends add_vehicle
{
    public int vTemp = 1;
    private int vRandom = Greenfoot.getRandomNumber(1);
    private String vColor = "blank";
    private String vContainer = "Empty";
    //MyWorld world = (MyWorld)getWorld();
    public static int v_blue = 1;
    public static int v_red = 2;
    public static int v_green = 1;
    GreenfootImage image = getImage(); 
    
     
     /**
     * Act - do whatever the vehicle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
     {
         load_vehicle();

      }
     /**
     * If a container touches the vehicle (this actor) it changes the actor to another color
     */
     public void load_vehicle() 
     {
        //MyWorld world = (MyWorld)getWorld();
        Actor red = getOneIntersectingObject(container_red.class);
        Actor green = getOneIntersectingObject(container_green.class); 
        Actor blue = getOneIntersectingObject(Container.class);
        if (v_blue > 0 && v_red > 0 && v_green > 0)
        {

            if (vRandom == 0) 
              {  
               setImage("Truck_red.png"); 
               vColor = "red";
               if (vColor == container_red.vmg2_Red && red != null)
               {
                 touchcontainer();
                 v_red = v_red-1;
               }
              
            }
            if (vRandom == 1) 
              {
               setImage("Truck_blue.png");
               vColor = "blue";
               if (vColor == Container.vmg2_Blue && blue != null)
               {
                 touchcontainer();
                 v_blue = v_blue-1;
               }
              
            }
            if (vRandom == 2) 
              {     
               setImage("Truck_green.png");
               vColor = "green";
               if (vColor == container_green.vmg2_Green && green != null)
               {
                 touchcontainer();
                 v_green = v_green-1;
               }
              
            }

          }
     }
    
     /**
     * If a container touches the vehicle (this actor) it deletes the container from the world.
     */
     public void touchcontainer()
     {
       Actor b = getOneIntersectingObject(Mover.class);
         if(b != null)  
         {  
          getWorld().removeObject(b);
          getWorld().removeObject(this);
          vRandom =  Greenfoot.getRandomNumber(1);
          add_vehicle.vmg2_test123 = 1;
       }
     }
    
}
