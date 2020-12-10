package bsl.entities;

import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

public interface GameEngineAPI
{

    // here we define methods that are specific to controlling the game such as descripted below
   // boolean start(int level); // begin the game
    //boolean stop();  // stop the game
    //boolean nextLevel(int level); // lead the user to the next level;
    //void hint(); // show the user some hints when they have made so many wrong matches
    //boolean  reset();
    //---------------------------------------------------------------------------------------
    @SqlUpdate("insert into player (level , score , status , name , completed) values (?, ? , ? , ? , ?)")
    void createPlayer(@Bind("level")int level , @Bind("score")int score , @Bind("status")String status , @Bind("name")String name , @Bind("completed") boolean completed); // method for inserting these attributes into the database
    @SqlQuery("select * from player where name = ?")
    @RegisterBeanMapper(User.class)
    User userByName(@Bind("name") String name);







}
