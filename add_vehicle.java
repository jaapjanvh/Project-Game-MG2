import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class add_vehicle extends Actor
{
    public static int vmg2_test123  = 2;
    /**
     * Act - do whatever the test wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        addnewvehicel();
        System.out.println("BLUE: " + vehicle.v_blue +"RED: "+ vehicle.v_red +"GREEN: "+ vehicle.v_green);
    }
    
    public void addnewvehicel()
    {
         if (vehicle.v_blue > 0 || vehicle.v_red > 0 || vehicle.v_green > 0)
         {
         //System.out.println("TEST1 "+ vmg2_test123);
             if (vmg2_test123 == 2)
             {
                 vehicle vehicle = new vehicle();
                 getWorld().addObject(vehicle,575,610);
                 vmg2_test123 = 0;
             }
             if (vmg2_test123 == 1)
                 {
                 vehicle vehicle = new vehicle();
                 getWorld().addObject(vehicle,575,610);
                 vmg2_test123 = 0;
                 }
           // System.out.println("TEST2 "+ vmg2_test123);
        }
    }
}
