/*
 * Sorumlu : Ceren (puan/seviye: Melisa)
 * Video   : 2, 5
 * Görev   : Bloğun kendiliğinden aşağı inmesini sağlayan döngü.
 */
package tetris;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GameThread extends Thread
{
    private GameArea ga;
    private int score;
    private int level = 1;
    private int scorePerLevel = 3;

    private int pause = 1000;
    private int speedupPerLevel = 100;

    public GameThread(GameArea ga)
    {
        this.ga = ga;
    
    }

    @Override
    public void run()
    {
        while(true)
        {
            ga.spawnBlock();
            
            while(ga.moveBlockDown() )
            {
                try {
                    Thread.sleep(pause);
                }
                catch (InterruptedException ex) {
                    Logger.getLogger(GameThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if(ga.isBlockOutOfBounds())
            {
                System.err.println("Game Over");
                break;
            }
            ga.moveBlockToBackground();
            score += ga.clearLines();

            int lvl = score / scorePerLevel + 1;
            if(lvl > level)
             {
                level = lvl;
                pause -= speedupPerLevel;
                
             }
        }
    }
}