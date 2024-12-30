import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PipeLvl3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PipeLvl3 extends Actor
{
    public PipeLvl3(){
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
         setLocation(getX() - 7, getY());
         if(getX() <= 1){
            setLocation(getX() + 800, Greenfoot.getRandomNumber(187)+100);
        }
    }    
}
