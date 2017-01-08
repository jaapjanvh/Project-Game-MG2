import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class containersub here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class container_blue extends Mover
{
    public static String vmg2_Blue = "blue";
    /**
     * Act - do whatever the container wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public container_blue()
    {
        GreenfootImage image = getImage();  
        image.scale(70, 70);
        setImage(image);

        setGravity(2);
        setMovementSpeed(5);
        setBlockingClasses(new Class[]{container_blue.class});
    }

    public void act() 
    {
        // Add your action code here.
        doGravity();
        //c_move();
        mg2_MoveCont();
    }
}
