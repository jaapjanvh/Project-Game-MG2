import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class hook extends Actor
{
    /**
     * Act - do whatever the hook wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public hook()
    {
        GreenfootImage image = getImage();  
        image.scale(60, 60);
        setImage(image);    
    } 
        
    public void act() {   
        checkInput();
        //test();   
    }
    
    int speed;

    //&& getOneIntersectingObject(container1.class) == null
    
    
    private void checkInput()
    {
        speed = 2;
        if(Greenfoot.isKeyDown("right")  )
        {
            move(speed);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            move(-speed);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-speed*2);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+speed*3);
        }       
    }
   
}