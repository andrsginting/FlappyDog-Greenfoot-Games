import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Flappybird here.
 * setRotation((int)(1 * 16)); Greenfoot.playSound("flay.mp3");
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DogLvl1 extends Actor
{
    /**
     * Act - do whatever the manuk_easy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private double g = 1;
    private int y = 200;

    private boolean haspressed = false;
    private boolean isalive = true;
    private boolean isacross = false;
    private boolean hasaddscore = false;
    private int livesCount = 1;
    
    
    public DogLvl1(){
        GreenfootImage image = getImage();
        image.scale(60,52);
    }
    
    private void removeLife()
    {
        livesCount--;
        testEndGame();
        showStatus();
    }
    
    public void showStatus()
    {
        getWorld().showText("Lives: "+livesCount, 900,30);
    }
    
    private void testEndGame(){
        if (livesCount < 1) {
            if(!isalive){
            getWorld().addObject(new Gameover(), 470, 260);
            getWorld().addObject(new TryAgain(), 470, 490);
            getWorld().removeObject(this);
        }
        }
    }
    
    public void act()
    {
        if(Pressed()){
            g=-3;
        }
        g += 0.3;
        y += g;
        setLocation(getX(), (int)(y));
        if(isTouchpipe()){
            isalive = false;
        }
        
        if(!hasaddscore && isacross && isalive){
            Greenfoot.playSound("score.mp3");
            Score.add(1);
        }
        hasaddscore = isacross;
        showStatus();
    }
    public boolean Pressed(){
        boolean pressed = false;
        if(Greenfoot.isKeyDown("Space") || Greenfoot.mouseClicked(null)){
            if(!haspressed){
                Greenfoot.playSound("barking.mp3");
                pressed = true;
            }
            haspressed = true;
        }else{
            haspressed = false;
        }
        return pressed;
    }
    public boolean isTouchpipe(){
        isacross = false;
        for(PipeLvl1 pipe : getWorld().getObjects(PipeLvl1.class)){
            if(Math.abs(pipe.getX() - getX()) < 69) {
            if(Math.abs(pipe.getY() + 30 - getY()) > 37){
                Greenfoot.playSound("peng.mp3");
                isalive = false;    
                removeLife();
            }
            isacross = true;
        }
    }
    return !isalive;
} 
}
