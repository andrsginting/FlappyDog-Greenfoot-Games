import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PipeLvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PipeLvl2 extends Actor
{
    public PipeLvl2(){
        GreenfootImage image = getImage();  
        image.scale(500, 900);
    }
    /**
     * Act - do whatever the Pipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         setLocation(getX() - 5, getY());
         if(getX() <= 1){
            setLocation(getX() + 800, Greenfoot.getRandomNumber(225)+100);
        }
    }    
}
