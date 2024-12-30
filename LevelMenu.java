import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelMenu extends World
{

    /**
     * Constructor for objects of class LevelMenu.
     * 
     */
    public LevelMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1);
        addObject(new Level1Button(), 180, 300);
        addObject(new Level2Button(), 480, 300);
        addObject(new Level3Button(), 780, 300);
    }
}
