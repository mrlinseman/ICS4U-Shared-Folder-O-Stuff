/* Selection4c
 * Mr. Linseman
 * ICS3U
 * September. 11, 2018
 * Description: This program will  
 * Find change for up to 1 dollar using a minimum number of coins
 */ 

class Selection4c {
  
  public static void main(String[] args){
    
    int pennies = 0, nickels = 0, dimes = 0, quarters = 0;
    int origValue = (int)(Math.random()*100) + 1;
    int newValue = 0;                      
    System.out.println("Value of All Coins: "+origValue);
    
    pennies = origValue%5; //How many pennies
    newValue = origValue - pennies; //Remove pennies
    
    quarters = newValue/25; //How many quarters
    newValue = newValue%25; //Remove quarters
    
    dimes = newValue/10; //How many dimes
    newValue = newValue%10; //Remove dimes
    
    nickels = newValue/5; //How many nickels
    
    System.out.println("Q: "+quarters+"\nD: "+dimes+"\nN: "+nickels+"\nP: "+pennies);                          
    
  }  
}











