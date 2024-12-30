import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{
    
    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    
    
        
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1);
    
        Button playButton = new Button("logo_play2.png",new LevelMenu());
        addObject(playButton, 600, 306);
        
        Button helpButton = new Button("logo_help2.png",new HowToPlay());
        addObject(helpButton, 800, 305);
        
    }
}
