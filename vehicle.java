import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Vehicle class.
 * Spawns in a random vehicle as long as there are containers in the world.
 * 
 * @BramBrouwer
 * 
 */
public class vehicle extends add_vehicle
{
    public int vRandom = Greenfoot.getRandomNumber(3);
    public int vRandom1 = Greenfoot.getRandomNumber(2);    
    private String vColor = "blank";
    public static int v_blue = 3;
    public static int v_red = 2;
    public static int v_green = 2;
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
     * If a container is placed (collision) on a vehicle both will dissapear from the world.
     * It will add a new vehicle and this function set a random colored vehicle
     */
     public void load_vehicle() 
     {
        Actor red = getOneIntersectingObject(container_red.class);
        Actor green = getOneIntersectingObject(container_green.class);
        Actor blue = getOneIntersectingObject(Container.class);
        /**
         * If there is still a container in every color, set random colored truck
         * 
         */
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
        else if (v_blue > 0 && v_red > 0 && v_green == 0)
        {
             if (vRandom1 == 0) 
              {  
               setImage("Truck_red.png"); 
               vColor = "red";
               if (vColor == container_red.vmg2_Red && red != null)
               {
                 touchcontainer();
                 v_red = v_red-1;
               }
              
            }
            if (vRandom1 == 1) 
              {
               setImage("Truck_blue.png");
               vColor = "blue";
               if (vColor == Container.vmg2_Blue && blue != null)
               {
                 touchcontainer();
                 v_blue = v_blue-1;
               }
              
            }
        }
        else if (v_blue == 0 && v_red > 0 && v_green > 0)
        {
            if (vRandom1 == 0) 
              {  
               setImage("Truck_red.png"); 
               vColor = "red";
               if (vColor == container_red.vmg2_Red && red != null)
               {
                 touchcontainer();
                 v_red = v_red-1;
               }
              
            }
            if (vRandom1 == 1) 
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
        else if (v_blue > 0 && v_red == 0 && v_green > 0)
        {
            if (vRandom1 == 0) 
              {  
               setImage("Truck_green.png"); 
               vColor = "green";
               if (vColor == container_green.vmg2_Green && green != null)
               {
                 touchcontainer();
                 v_green = v_green-1;
               }
              
            }
            if (vRandom1 == 1) 
              {
               setImage("Truck_blue.png");
               vColor = "blue";
                    if (vColor == Container.vmg2_Blue && blue != null)
                    {
                     touchcontainer();
                     v_blue = v_blue-1;
                    } 
            }
        }
        else if (v_blue > 0 && v_red == 0 && v_green == 0)
        {
               setImage("Truck_blue.png");
               vColor = "blue";
                    if (vColor == Container.vmg2_Blue && blue != null)
                    {
                     touchcontainer();
                     v_blue = v_blue-1;
                    }   
        }
        else if (v_blue == 0 && v_red > 0 && v_green == 0)
        {
               setImage("Truck_red.png");
               vColor = "red";
                    if (vColor == container_red.vmg2_Red && red != null)
                    {
                     touchcontainer();
                     v_red = v_red-1;
                    }   
        }
        else if (v_blue == 0 && v_red == 0 && v_green > 0)
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
          add_vehicle.vmg2_addvehicle = 1;
       }
     }
    
}
