import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class add_vehicle extends Actor
{
    public static int vmg2_addvehicle  = 2;
    /**
     * Act - do whatever the add_vehicle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        addnewvehicel();
    }
    /**
     * Adds a vehicle to the world. 
     * Starts with 2. Then after a vehicle is removed, vmg2_test is set to 1 and it triggers this funtion to add a new vehicle.
     */
    public void addnewvehicel()
    {
         if (vehicle.v_blue > 0 || vehicle.v_red > 0 || vehicle.v_green > 0)
         {
             if (vmg2_addvehicle == 2)
             {
                 vehicle vehicle = new vehicle();
                 getWorld().addObject(vehicle,575,610);
                 vmg2_addvehicle = 0;
             }
             if (vmg2_addvehicle == 1)
                 {
                 vehicle vehicle = new vehicle();
                 getWorld().addObject(vehicle,575,610);
                 vmg2_addvehicle = 0;
                 }
        }
        else
        {
            World myWorld = getWorld();
            GameOver gameover = new GameOver();
            myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
            Greenfoot.stop();           
        }
    }
}
