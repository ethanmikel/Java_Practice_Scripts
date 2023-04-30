if (this.isValidName(firstName) && this.isValidName(lastName)){
           possibleNames = new ArrayList<String>();
           for (int i = 1; i <firstName.length() + 1; i++){
               possibleNames.add(lastName + firstName.substring(0,i));
           }  
       } 
	else {
           System.out.println("firstName and lastName must contain letters only.");
       }
   }
   public boolean isUsed(String name, String[] arr){
       for(int i = 0; i < arr.length; i++){
           if (name.equals(arr[i]))
               return true;
       }
       return false;
   }
