package bsl.entities;

public class User extends BslGameEngine
{

    private int score;
    private String username;

    public User()
    {
    }
    public int getScore()
    {
        return score;
    }
    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    @Override
    public String toString()
    {
        return "User{" +
                "id=" + id +
                ", level=" + level +
                ", score=" + score +
                ", status='" + status + '\'' +
                ", completed=" + completed +
                '}';
    }
}
