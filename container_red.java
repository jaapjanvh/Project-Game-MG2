import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class containersub here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class container_red extends Mover
{
    public static String vmg2_Red = "red";
    /**
     * Act - do whatever the container wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public container_red()
    {
        GreenfootImage image = getImage();  
        image.scale(70, 70);
        setImage(image);

        setGravity(2);
        setMovementSpeed(5);
        setBlockingClasses(new Class[]{container_red.class});

    }

    public void act() 
    {
        GreenfootImage image = getImage();
        doGravity();
        //c_move();
        mg2_MoveCont();
        //mg2_ContCanMove();
        //System.out.println("Right: " + getOneObjectAtOffset(-image.getWidth()/2,0, null) + " ||Left: " + getOneObjectAtOffset(+image.getWidth()/2,0, null));
        //System.out.println("Right: " + getOneObjectAtOffset(-image.getWidth()/2,image.getHeight()/2, null) + " ||Left: " + getOneObjectAtOffset(+image.getWidth()/2,image.getHeight()/2, null));
       // System.out.println("Width: " + image.getWidth() + " ||Height: " + image.getHeight());
    }
}
