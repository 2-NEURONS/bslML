package bsl;

import bsl.database.DBconnect;
import bsl.entities.GameEngineAPI;
import bsl.entities.User;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import spark.template.handlebars.HandlebarsTemplateEngine;

import javax.swing.*;
import java.util.List;
import java.util.Properties;
import static spark.Spark.*;

public class Main
{

    private static Properties propertiesDB = new Properties(); // username and password properties for our database
    static HandlebarsTemplateEngine handlebarsEngine = new HandlebarsTemplateEngine(); // we will be using handle bars as our templating engine

    public static void main(String[] args)
    {

        propertiesDB.setProperty("username","coder  "); // db username
        propertiesDB.setProperty("password","coder123"); // db password

        DBconnect connect = new DBconnect("jdbc:postgresql://localhost:5432/bsl", propertiesDB); // db setup
        Jdbi jdbi = Jdbi.create(connect.getURL(), connect.getProperties()); // create an instance of jdbi so you can use it later to send queries
        jdbi.installPlugin(new SqlObjectPlugin()); // just so we can use SQLObjects
        Route route = new Route(jdbi);  // so that we can reference our route handlers inside our http verbs
        port(8080); // start at port 80
        port(getHerokuAssignedPort());
        post("/",route::homepageHandler); //let create a homepage route







    }
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 8080; //return default port if heroku-port isn't set (i.e. on localhost)
    }
}
