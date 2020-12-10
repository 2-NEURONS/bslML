package bsl;

import bsl.entities.GameEngineAPI;
import bsl.entities.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jdbi.v3.core.Jdbi;
import spark.Request;
import spark.Response;
import javax.swing.*;

public class Route
{
    private Jdbi jdbi;
    private ObjectMapper gson = new ObjectMapper();

    public Route(Jdbi jdbi)
    {
        setJdbi(jdbi);
    }
    //handle homepage request
    public String homepageHandler(Request request , Response response) throws JsonProcessingException
    {
          /*
              create a user.
              insert name, status , score  and level into the player database


         */

        String username = new String(request.queryParams("username")); // read the username as a string from the front end
        int gameLevel = new Integer(request.queryParams("level").toString()); // read game level as a string and wrap into an integer


        jdbi.useExtension(GameEngineAPI.class, game -> game.createPlayer(gameLevel, 0, "started level "+gameLevel, username, false));
         //JOptionPane.showMessageDialog(null, "success");
        //do homepage stuff;
        // return gson.writerWithDefaultPrettyPrinter().writeValueAsString(jdbi.withExtension(GameEngineAPI.class , game -> game.userByName(username)));
        return jdbi.withExtension(GameEngineAPI.class , game -> game.userByName(username)).toString();
    }
    public Jdbi getJdbi()
    {
        return jdbi;
    }
    public void setJdbi(Jdbi jdbi)
    {
        this.jdbi = jdbi;
    }



}
