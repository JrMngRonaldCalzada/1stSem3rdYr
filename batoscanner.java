package FirstYearSecondSem;

import java.util.Scanner;
public class batoscanner
{
   public static void main(String args[])
   {
      int bato, kamote, kamatis, array[];

      Scanner input = new Scanner(System.in);
      System.out.println("Enter the index you want:");
      kamote = input.nextInt(); 

      array = new int[kamote]; 
      System.out.println("Enter " + kamote + " element");

      for (bato = 0; bato < kamote; bato++)
        array[bato] = input.nextInt();

      System.out.println("Search the element:");
      kamatis = input.nextInt();

      for (bato = 0; bato < kamote; bato++)
      {
         if (array[bato] == kamatis) 
         {
           System.out.println(kamatis+" is in index "+(bato));
         
           break;
         }
      }
      if (bato == kamote)
        System.out.println(kamatis + " doesn't exist in array.");
   }
}