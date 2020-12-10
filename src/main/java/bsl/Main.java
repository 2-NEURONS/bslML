package bsl;

import bsl.database.DBconnect;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import spark.template.handlebars.HandlebarsTemplateEngine;
import java.util.Properties;
import static spark.Spark.*;

public class Main
{

    private static Properties propertiesDB = new Properties(); // username and password properties for our database
    static HandlebarsTemplateEngine handlebarsEngine = new HandlebarsTemplateEngine(); // we will be using handle bars as our templating engine

    public static void main(String[] args)
    {

        propertiesDB.setProperty("username",""); // db username
        propertiesDB.setProperty("password",""); // db password

        DBconnect connect = new DBconnect("jdbc:postgresql://localhost:5432/bsl", propertiesDB); // db setup
        Jdbi jdbi = Jdbi.create(connect.getURL(), connect.getProperties()); // create an instance of jdbi so you can use it later to send queries
        jdbi.installPlugin(new SqlObjectPlugin()); // just so we can use SQLObjects
        Route route = new Route(jdbi);  // so that we can reference our route handlers inside our http verbs
        get("/",route::homepageHandler); // let create a homepage route









    }
}
