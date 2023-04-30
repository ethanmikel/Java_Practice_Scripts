/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie
{
   private int rating;
   private String title;
   private int duration;
    public Movie()
    {
        rating = 0;
        title = "";
        duration = 0;
   }
    public String getTitle() {
       return title;
   }
    public void setTitle(String t) {
       title = t;
   }
    public int getRating() {
       return rating;
   }
   public void setRating(int r) {
       rating = r;
   }
   public int getDuration() {
       return duration;
   }
   public void setDuration(int d) {
       duration = d;
   }
}
