class enhancedForLoopExample {
  public static void main (String args[]){

    int[] values = {4,3,7,1};
   
    //Counted Loop
    for(int i = 0; i<values.length ; i++)
    System.out.println(values[i]);
    
    //Enhanced For-Loop
    for(int i : values)
      System.out.println(i);   
}
}