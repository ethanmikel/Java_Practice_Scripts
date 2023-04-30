/**
 *
 * @author (Ethan Mikel)
 * @version (12/2/19)
 */
public class Pet
{
    //set the private methods
    private String name;
    private int age;
    private double weight;
    private String type;
    private String breed;
   //constructors for the variables; top one no parameter and bottom one initializes all the variables
     public Pet()
    {
        name = " ";
        age = 0;
        weight = 0.0;
        type = " ";
        breed = " ";
   }
    public Pet(String name, int age, double weight, String type, String breed) {
       this.name = name;
       this.age = age;
       this.weight = weight;
       this.type = type;
       this.breed = breed;
   }
   //returns all of the pet information
   public String toString() {
       return ("Name: " + name + "  Age: " + age + " Years Old  Weight: " +  weight + " lb.  Type of Animal: " + type + "  Breed: " + breed);
   } 
   //accessor methods for all of the variables
    public String getName() {
       return name;
   }
   public void setName(String n) {
       name = n;
   }
   public int getAge() {
       return age;
   }
   public void setAge(int a) {
       age = a;
   }
   public double getWeight() {
       return weight;
   }
   public void setWeight(double w) {
       weight = w;
   }
   public String getType() {
       return type;
   }
   public void setType(String t) {
       type = t;
   }
   public String getBreed() {
       return breed;
   }
   public void setBreed(String b) {
       breed = b;
   }
}
