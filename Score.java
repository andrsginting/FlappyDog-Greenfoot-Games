import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int score;//membuat variabel score
    public Score(){
        score = 0;//pemberian niali awal score sebesar 0
    }
    public void act(){
        World myWorld = getWorld();
        myWorld.showText("Score: " + String.valueOf(score), 53, 500);//penempatan nilai score
    }
    //skor akan bertambah sesuai dengan pipa yang dilewati
    public static void add(int num){
        score += num;
    }
}
