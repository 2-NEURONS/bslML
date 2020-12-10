package bsl.entities;

public class BslGameEngine implements GameEngineAPI
{
        /*
             implement the game
      */
        protected int id;
        protected int level;
        protected String status;
        protected boolean completed;

           /*

                working of the game,

                - a user clicks  begin , and they will start with level 1 of the game.....
                - a the status of the game must change to the current level
                - the level of the game must change to one
                - completed must be set to true if the user show our model the correct sign language element.

                level 1......

                a user needs to count using sign language from 1 - 5;

                the user must count in that specified sequence , i.e they can't jump.....from 1 to 3 e.t.c

                if the count is correct , the user will here a sound for success otherwise they will here an error sound and a flash message that says try again.

                when a user reaches up to 5 .....the game level must change to the next level....


                 Level 2

                level two.... basic communication...greeting e.t.c



                a user will click begin , then they will be taken to a the page containing our model to prompt them to do the basic greeting thing.

                sequence will be....hello  , how are you ? , i'm well thank you...bye bye

                when a user is done... the last stage will be basic arithmatic with in the integers in the range of 1 and 3 minimum....

                after a user has completed ...they will be cheered that they clocked the game......


                users will be able to clear their progress or score.....

         */

    public BslGameEngine()
    {
    }
       //getters and setters
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public int getLevel()
    {
        return level;
    }
    public void setLevel(int level)
    {
        this.level = level;
    }
    public String getStatus()
    {
        return status;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }
    public boolean isCompleted()
    {
        return completed;
    }
    public void setCompleted(boolean completed)
    {
        this.completed = completed;
    }
    @Override
    public boolean start() // must be dynamic
    {
         // let the game begin
        // change status in the database to level one in progess......
        //change level
        //change status





        return false;
    }
    @Override
    public boolean stop()
    {
        return false;
    }
    @Override
    public boolean nextLevel()
    {
        return false;
    }
    @Override
    public void hint()
    {

    }
    @Override
    public boolean reset()
    {
        return false;
    }
    // game api methods


}