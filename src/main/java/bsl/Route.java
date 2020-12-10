package bsl;

import org.jdbi.v3.core.Jdbi;
import spark.Request;
import spark.Response;

public class Route
{
    private Jdbi jdbi;

    public Route(Jdbi jdbi)
    {
        setJdbi(jdbi);
    }
    public String homepageHandler(Request request , Response response)
    {

        //do homepage stuff;
        return "";
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
