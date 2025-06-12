public class Rating
{
    private int score;
    private String comments;

    public Rating(int score, String comments)
    {
        this.score = score;
        this.comments = comments;
    }
    
    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public String getComments()
    {
        return comments;
    }

    public void setComments(String comments)
    {
        this.comments = comments;
    }
}
