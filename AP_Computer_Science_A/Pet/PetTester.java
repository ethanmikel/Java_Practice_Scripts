/**
 * Write a description of class AnimalClinic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PetTester
{
   public static void String () {
    
    //creates three pet variables and sets the main methods
    Pet pet =  new Pet ("Percy", 5, 31.5, "Dog", "Sealyham Terrier");
    Pet pet2 = new Pet ("Charlie", 2, 6.2, "Cat", "Ragdoll");
    Pet pet3 = new Pet ("Frosty", 6, 2.5, "Bunny", "Mini Holland Lop");
    Pet pet4 = new Pet ("Moonlight", 2, 0.1, "Fish", "Beta");
    
    System.out.println("Welcome to Your Pet's Database! \n");
    
    //test for all of the parameter for pet 1 and then print it out a sentence a pet record from all of the parameters
    //also it changes the variables to another dogs information by using setter methods and then it print it out the new information
    System.out.println("Pet's Record: " + pet);
    System.out.print("Your first pet is " + pet.getName());
    System.out.print(", I am " + pet.getAge());
    System.out.print(" years old and weigh " + pet.getWeight() + " lb.");
    System.out.println(" I am also a " + pet.getBreed()  + " " + pet.getType() + ".");
    pet.setName("Sully");
    pet.setAge(8);
    pet.setWeight(55.2);
    pet.setBreed("Chocolate Lab");
    System.out.println("Updated Information: New Name: " + pet.getName() + "  New Weight: " + pet.getWeight() + " lb.  New Age: " + pet.getAge() + "  New Breed: " + pet.getBreed());
    
    //test for all of the parameter for pet 2 and then print it out a sentence a pet record from all of the parameters
    System.out.println("\n");
    System.out.println("Pet's Record: " + pet2);
    System.out.print("Your second pet is " + pet2.getName());
    System.out.print(", I am " + pet2.getAge());
    System.out.print(" years old and weigh " + pet2.getWeight() + " lb.");
    System.out.println(" I am also a " + pet2.getBreed()  + " " + pet2.getType() + ".");
    
    //test for all of the parameter for pet 3 and then print it out a sentence a pet record from all of the parameters
    System.out.println("\n");
    System.out.println("Pet's Record: " + pet3);
    System.out.print("Your third pet is " + pet3.getName());
    System.out.print(", I am " + pet3.getAge());
    System.out.print(" years old and weigh " + pet3.getWeight() + " lb.");
    System.out.println(" I am also a " + pet3.getBreed()  + " " + pet3.getType() + ".");
    
    //test for all of the parameter for pet 4 and then print it out a sentence a pet record from all of the parameters
    System.out.println("\n");
    System.out.println("Pet's Record: " + pet4);
    System.out.print("Your fourth pet is " + pet4.getName());
    System.out.print(", I am " + pet4.getAge());
    System.out.print(" years old and weigh " + pet4.getWeight() + " lb.");
    System.out.println(" I am also a " + pet4.getBreed()  + " " + pet4.getType() + ".");
  }
}
