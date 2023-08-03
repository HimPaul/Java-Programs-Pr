package basicjavaprograms;

public class temp {

	public static void main(String[] args) {
	
		 //String s= "Today is the happiest day of my life by vijayakumar";
         String [] word =  {"flowwwwwwwww","fli","flower"};;
         String minlethWord = word[0];
         
         
          for(int i = 0; i < word.length; i++){
          if(word[i].length() <= minlethWord.length()){
                minlethWord = word[i];
          }
     }
      System.out.println("smallest substring is: "+ minlethWord); 
      
      String maxLength = "";
      for(int j = 0;j<word.length;j++) {
    	  if(word[j].length() >= maxLength.length()) {
    		  maxLength = word[j];
    	  }
      }
      System.out.println("Largest substring is: "+maxLength);
	}
	
}
