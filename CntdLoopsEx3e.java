/* CntdLoopsEx3e
 * Mr. Linseman
 * ICS3U
 * September. 06, 2018
 * Description: This program will  
 * Output symbols to the screen a designated number of times per line
 * at the user's request
 */ 

class CntdLoopsEx3e {
  
  public static void main(String[] args){
    //Counted loops - used when you already know how many times 
    // you will be repeating some code
    
    String userEntry; //Dummy variable reused for every user entry
    char userSym = '!';
    int numSymbols = 0, maxPerLine = 0, numFullLines = 0, numRemaining = 0;
    boolean unaccepted = true;
    
    //Input
    do{ //Trap to ensure user is entering a character to be printed
      System.out.print("Enter a symbol you would like printed: ");
      try{
        
        userEntry = In.getString(); //Gathering whatever the user types
        
        userSym = userEntry.charAt(0);
        unaccepted = false;
        
      }catch(Exception e){
        System.out.println("Wrong entry. Must be a character. Try again...");
      }   
    }while(unaccepted);
    
    unaccepted = true; 
    
    do{ //Trap to ensure user into entering integer for maxPerLine
      System.out.print("Enter the number of symbols you would like printed: ");
      try{
        
        userEntry = In.getString(); 
        
        numSymbols = Integer.parseInt(userEntry);
        unaccepted = false;
        
      }catch(Exception e){
        System.out.println("Wrong entry. Must be an integer. Try again...");
      }   
    }while(unaccepted);
    
    unaccepted = true;    

    //Trap user until they give the maxPerLine
    
    do{ //Trap to ensure user into entering integer for maxPerLine
      System.out.print("Enter the maximum number of symbols you would like printed per line: ");
      try{
        
        userEntry = In.getString(); 
        
        maxPerLine = Integer.parseInt(userEntry);
        unaccepted = false;
        
      }catch(Exception e){
        System.out.println("Wrong entry. Must be an integer. Try again...");
      }   
    }while(unaccepted);
    
    
    //Processing
    
    numFullLines = numSymbols/maxPerLine; 
    numRemaining = numSymbols%maxPerLine;
    
    
    
    //Output
    /*************************/
    //Print all full lines
    
    // Outer loop to ensure the correct number of full lines 
    // are printed
    for (int i = 0;i<numFullLines;i++){
      // Inner loop to ensure the correct number of symbols 
      // in each of the full lines is printed
      for (int j = 0; j<maxPerLine; j++)  
          System.out.print(userSym);
      System.out.println("");
    }
    
    /*************************/
    //Printout the remaining symbols
    for (int i = 0; i < numRemaining ; i++)
          System.out.print(userSym);
    System.out.println("");
  }  
}