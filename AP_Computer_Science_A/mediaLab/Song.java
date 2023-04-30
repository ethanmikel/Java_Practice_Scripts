/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
   private int rating;
   private String title;
   private double price;
   private boolean favorite;
   private double totalCost;
   private int numSongs;
    public Song()
    {
        rating = 0;
        title = "";
        price = 0.0;
        totalCost = 0.0;
        numSongs = 0;
   }
    public Song(String title, double price) {
       rating = 0;
       this.title = title;
       this.price = price;
   }
    public Song(String title, double price, int rating) {
       this.rating = rating;
       this.title = title;
       this.price = price;
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
   public double getPrice() {
       return price;
   }
   public void setPrice(double p) {
       price = p;
   }
   public boolean getFavorite() {
       return favorite;
   }
   public void addToFavorites() {
    favorite = true;
   }
   public double getTotalCost() {
       return totalCost;
   }
   public void setTotalCost(double c) {
       totalCost =  c;
   }
   public int getNumSongs() {
       return numSongs;
   }
   public void setNumSongs(int s) {
       numSongs = s;
   }
}