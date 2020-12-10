package bsl.database;

import java.util.Properties;

public class DBconnect
{
    //do database connection stuff;
    private String URL;
    private Properties properties;

    public DBconnect(String URL, Properties properties)
    {
        this.URL = URL;
        this.properties = properties;
    }
    public String getURL()
    {
        return URL;
    }
    public void setURL(String URL)
    {
        this.URL = URL;
    }public Properties getProperties()
    {
        return properties;
    }
    public void setProperties(Properties properties)
    {
        this.properties = properties;
    }
    @Override
    public String toString()
    {
        return "DBconnect{" +
                "URL='" + URL + '\'' +
                ", properties=" + properties +
                '}';
    }
}
