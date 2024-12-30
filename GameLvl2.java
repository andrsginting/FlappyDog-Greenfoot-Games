import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameLvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameLvl2 extends World
{

    /**
     * Constructor for objects of class GameLvl2.
     * 
     */
    private long startTime; // Waktu mulai permainan
    private int totalTime = 80000; // Waktu total dalam milidetik (misalnya, 80 detik)
    private int timeInterval = 1000; // Interval waktu berkurang dalam milidetik (misalnya, 1 detik)
    private String playerName;
    private String name;
    
    public GameLvl2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1); 
        addObject(new DogLvl2(), 70, 190);
        addObject(new PipeLvl2(), 275, 220);
        addObject(new PipeLvl2(), 540, 150);
        addObject(new PipeLvl2(), 790, 200);
        addObject(new Score(), 300, 100);
        startTime = System.currentTimeMillis();
        showText("Level 2", 50, 475);
        playerName = name;
    }
    
    public void act(){
    long currentTime = System.currentTimeMillis();
        long elapsedTime = currentTime - startTime;
        if (elapsedTime < totalTime) {
            // Hitung waktu yang tersisa
            long timeLeft = totalTime - elapsedTime;
        // Tampilkan waktu di layar
            showTimeLeft(timeLeft);
        } 
        else {
            // Permainan berakhir karena waktu habis
            Greenfoot.stop();
            System.out.println("TIME OUT! Click RESET to play again");
        }
    }
    
    private void showTimeLeft(long timeLeft)
    {
        String timeText = "Waktu: " + (timeLeft / 1000) + " detik";
        GreenfootImage timeImage = new GreenfootImage(timeText, 24, Color.BLACK, Color.WHITE);
        getBackground().drawImage(timeImage,10,10); 

    }
    
    private void showPlayerName() {
    GreenfootImage playerNameImage = new GreenfootImage("Nama Pemain: " + playerName, 24, Color.BLACK, Color.WHITE);
        getBackground().drawImage(playerNameImage, 10, 35); // Atur posisi sesuai kebutuhan
    }
}
