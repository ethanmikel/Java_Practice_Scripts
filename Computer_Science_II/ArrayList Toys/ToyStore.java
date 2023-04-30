//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.util.ArrayList;
import java.util.Collections;

public class ToyStore {
   
   private ArrayList<Toy> toyList;
 
   public ToyStore(){
       toyList=new ArrayList<Toy>();
   }
   
   public void loadToys(String toys){
    String a[]=toys.split(" ");
    for(int i=0;i<a.length;i++){
       int j;
       for(j=0;j<toyList.size();j++){
          if(toyList.get(j).getName().equalsIgnoreCase(a[i])){
             toyList.get(j).setCount(toyList.get(j).getCount()+1);
          }
       }
       if(j==toyList.size()){
          Toy t1=new Toy();
          t1.setName(a[i]);
          t1.setCount(1);
          toyList.add(t1);
       }
     }
   }
   
   public Toy getThatToy(String nm){
      for(int i=0;i<toyList.size();i++){
         if(toyList.get(i).getName().equalsIgnoreCase(nm)){
            return toyList.get(i);
         }
      }
      return null;
   }
   
   public String getMostFrequentToy(){
      String repeat=""; 
      int max=0;
      for(int i=0;i<toyList.size();i++){
         if(toyList.get(i).getCount()>max){
            max=toyList.get(i).getCount();
         }
      }
      if(max!=0){
         for(int i=0;i<toyList.size();i++){ 
            if(toyList.get(i).getCount()==max){
               repeat+=toyList.get(i).getName()+"\n";
            }
         }
      }
      return repeat;
   }
   
   public void sortToysByCount(){
      Collections.sort(toyList,new Sortbycount());
   }
   
   public String toString(){
      String str="";
      for(int i=0;i<toyList.size()-1;i++){
         str+=toyList.get(i).getName()+" "+toyList.get(i).getCount()+",";
      }
      str += toyList.get(toyList.size()-1).getName()+" "+toyList.get(toyList.size()-1).getCount();
      return str;
   }
}