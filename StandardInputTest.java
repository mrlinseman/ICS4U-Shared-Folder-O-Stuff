import java.io.*;
class StandardInputTest
{
 public static void main(String[] args)
 {
InputStreamReader inStream = new InputStreamReader(System.in);
BufferedReader bufRead = new BufferedReader(inStream);
String firstName = "";

try
{
  
 firstName = bufRead.readLine();
}
catch (IOException err)
{
 System.out.println("Error reading line");
}
System.out.println("First name is: "+ firstName);
}
}