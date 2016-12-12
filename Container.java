import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class containersub here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Container extends Mover
{
    /**
     * Act - do whatever the container wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Container()
    {
        GreenfootImage image = getImage();  
        image.scale(100, 100);
        setImage(image);
        
        setGravity(2);
        setMovementSpeed(5);
        setBlockingClasses(new Class[]{Container.class});
    }
    
    public void act() 
    {
        // Add your action code here.
        doGravity();
        c_move();
    }    
}
