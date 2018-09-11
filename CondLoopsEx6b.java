/* CondLoopsEx6b
 * Mr. Linseman
 * ICS4U
 * September 11, 2018
 * Description: This program will  
 * Run a race to 100 m for four runners and stop when one (or more) runners win.
 */ 

class CondLoopsEx6b {
  
  public static void main(String[] args){
    
    int[] distRun = {0,0,0,0}; //These are the current locations for each of the runners
    int raceDist = 100;
    try{
      do{
        
        for(int i = 0; i < 4; i++)
          distRun[i] = updateDist(distRun[i]);
        
        for(int i = 1; i <= 4; i++)
          System.out.println("Runner "+i+": "+ distRun[i-1]);
        Thread.sleep(1000);
      }while(noWinners(distRun, raceDist));
    }catch(Exception e){
      System.out.println("Something went wrong");
    }   
    
    
  }
  
  public static int updateDist(int currDist){
    int speed = 0;
    speed = (int)(Math.random()*11) + 5; 
    currDist += speed;   
    return currDist;
  }
  
  public static boolean noWinners(int[] distRun, int raceDist){
    
    boolean someoneWon = false;
    for(int i = 0; i < 4; i++){
      if (distRun[i] >= raceDist)        
        someoneWon = true;           
    }
    return !someoneWon;
    
  }
}
