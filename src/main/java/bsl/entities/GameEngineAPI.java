package bsl.entities;

public interface GameEngineAPI
{
    // here we define methods that are specific to controlling the game such as descripted below
    boolean start(); // begin the game
    boolean stop();  // stop the game
    boolean nextLevel(); // lead the user to the next level;
    void hint(); // show the user some hints when they have made so many wrong matches
    boolean  reset();
    //---------------------------------------------------------------------------------------

}
