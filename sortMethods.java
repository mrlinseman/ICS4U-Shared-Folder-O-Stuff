/*Mr. Linseman
 * May. 02, 2018
 */
class sortMethods
{
  
  
  //Method to test out what is lexicographically first vs second
  // A positive output indicates that values are in the correct order
  public static void testCompare(String str1, String str2){
     
    int var1 = str1.compareTo( str2 );
    System.out.println("str1 & str2 comparison: "+var1); //-16     
   }
  
  public static int binSearch ( double[] list, double item)
  {
    int bottom = 0; // lower bound of searching
    int top = list.length - 1; // upper bound of searching
    int middle; // current search candidate
    boolean found = false;
    int location = -1; // location of item, -1 for failure
    while (bottom <= top && !found)
    {
      System.out.println("iter");
      middle = (bottom + top)/2; // integer division, auto-truncate
      if (list[middle] == item)
      {
        location = middle; // success!
        found = true;
      }
      else if (list[middle] < item)
      {
        bottom = middle + 1; // look only in top half
        location = middle;
      }
      else
      {
        top = middle - 1; // look only in bottom half
        location = middle;
      }
    }
    return location;
  }
  
  public static void insertSort( double[] list)
  {
    for (int top = 1; top < list.length; top++)
    {
      double item = list[top]; // temporary storage of item
      int i = top;
      while (i > 0 && item < list[i-1])
      {
// shift larger items to the right by one
        list[i] = list[i-1];
// prepare to check the next item to the left
        i--;
      }
      list[i] = item; // put sorted item in open location
    }
  }
  
  
  
  
  public static void selectSort (double[] list)
  {
    for (int top = list.length - 1; top > 0; top--)
    {
      int largeLoc = 0; // location of largest element
// assume list[0] is largest to start
      for (int i = 1; i <= top; i++) // check list[1] to list[top]
        if (list[i] > list[largeLoc])
        largeLoc = i;
      double temp = list[top]; // temporary storage
      list[top] = list[largeLoc];
      long time = System.nanoTime(); //outputs a long (integer)
      list[largeLoc] = temp;
    }
  }
  
 public static void bubbleSort (String[] list)
  {
    boolean sorted = false;
    int count = 1;
    for (int top = list.length - 1; top > 0 && !sorted; top--)
    {      
      sorted = true;
      for (int i = 0; i < top; i++){
            
        if (list[i].compareTo(list[i+1]) < 0)
        {
          sorted = false;
          String temp = list[i];
          list[i] = list[i+1];
          list[i+1] = temp;
        }
      }
      
    }
  }
  
  
  /*shellSort arr  */
 public static void shellSort(int arr[])
 {
  int n = arr.length;

  // Start with a big k, then reduce the k
  for (int k = n/2; k > 0; k /= 2)
  {
   // Do a k-th insertion sort for this k size.
   // The first k elements a[0..k-1] are already
   // in k-th order keep adding one more element
   // until the entire array is k sorted
   for (int i = k; i < n; i += 1)
   {
    // add a[i] to the elements that have been k
    // sorted save a[i] in temp and make a hole at
    // position i
    int temp = arr[i];

    // shift earlier k-th-sorted elements up until
    // the correct location for a[i] is found
    int j;
    for (j = i; j >= k && arr[j - k] > temp; j -= k)
     arr[j] = arr[j - k];

    // put temp (the original a[i]) in its correct
    // location
    arr[j] = temp;
   }
  }
  
 }
  
  
  
  public static void main(String args[]){  
    long time1, time2, diff;
    time1 = System.nanoTime(); //outputs a long (integer)
    //double[] arr = {1.0,8.0,9.0,5.0,2.0,17.0,2.0,6.0,5,6,7,8,9,6,5,4,3,4,5,10};
    int[] intArr = {5,10,4,7,8,2,8,5,6,7,4}; //Used for shell sort
    //String[] wordArray = {"Carl","Bill","Sharlene","Ben"}; 
    //insertSort(arr); //works with double[]
    //selectSort(arr); //works with double[]
    //bubbleSort(wordArray); //works with String[]
    shellSort(intArr); //works with int[] 
    time2 = System.nanoTime();
    diff = time2-time1;
    System.out.println("Elapsed time was "+diff+" milliseconds");
    
  }
  
  
  
}





