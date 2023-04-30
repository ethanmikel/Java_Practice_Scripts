/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Books
{
   private int rating;
   private String title;
    public Books()
    {
        rating = 0;
        title = "";
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
}
