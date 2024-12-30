    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PipeLvl1 extends Actor
{
    public PipeLvl1(){
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
         setLocation(getX() - 3, getY());
         if(getX() <= 1){
            setLocation(getX() + 800, Greenfoot.getRandomNumber(250)+100);
        }
    }    
}
