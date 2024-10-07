package cscd210lab5;

import java.util.Scanner;

public class CSCD210Lab5
{
   public static void main(String [] args)
   {
      
      // Build Scanner object
      Scanner kb = new Scanner(System.in);   
      int choice, theNum, copy, x, y, counter, even, odd, zero;
      
      // User input for number to work through
      System.out.print("Please enter a positive number: ");
      theNum = Integer.parseInt(kb.nextLine());      
      
      //Ensures theNum is positive   
      while(theNum < 1)
      {
         System.out.print("Your input was negative. Enter a positive number or the program will not continue: ");
         theNum = Integer.parseInt(kb.nextLine());
      }//end while loop
      
      // Initialize menu and different cases for options   
      do
      {
         // Print menu and take input
         do
         {
            // Menu
            System.out.println();
            System.out.println("Please choose from the following");
            System.out.println("1) Enter a new number");
            System.out.println("2) Print the number of even, odd and zeros in theNum");                           
            System.out.println("3) Print the prime numbers from 2 up to and possibly including theNum");
            System.out.println("4) Quit");
            System.out.print("Choice --> ");
            
            // Intake choice
            choice = Integer.parseInt(kb.nextLine());
            
            // Test choices for validity
            if(choice < 1 || choice > 4)
               System.out.println("Your input was not one of the choice. Enter one of the choices or the program will not continue. ");
               
         }while(choice < 1 || choice > 4); //end internal do while loop
                     
         // Start the switch statement                                    
         switch(choice)
         {
            // Option 1: New number
            case 1:  
                     System.out.println("Please enter a new positive number: ");
                     theNum = Integer.parseInt(kb.nextLine());
                     break;
                    
            // Option 2: even/odd/zero counter
            case 2:  
                     copy = theNum;
                     even = 0;
                     odd = 0;
                     zero = 0;
                     x = 0;
                     
                     // While loop counter
                     while(copy > 0)
                     {
                        x = copy % 10;
                        if(x == 0)
                           zero++;
                        else if(x % 2 == 1)
                           odd++;
                        else
                           even++;
                        copy /= 10;
                     } // end case 2 while loop
                     
                     System.out.printf("%d has %d odds, %d evens and %d zeros.", theNum, odd, even, zero);
                     System.out.println();
                     break;  
                     
            // print prime numbers from 2 to the Number entered
            case 3:  
                     // So basically- make a for loop that says for int between 2 and the num, print prime
                     // Then- we have a nested for loop that divides the int above by every number between 2 and it and then prints if nothing is divisable
                     x = 0;
                     System.out.printf("The prime numbers between 0 and %d are: ", theNum);
                     
                     // So here we are basically just running through all the numbers between 1 to theNum
                     for(x = 1; x <= theNum; x++)
                     {
                        counter = 0; //Initializing counter 
                        
                        // and here we are checking if every single number (x) is prime or not
                        for(y = 1; y <= x; y++)
                           {
                              if(x % y == 0) //basically dividing every x value by every value
                              {
                                 counter++; //using the counter to add up both the 1/1 = 0 and the x/x = 0
                              }
                           }
                           if(theNum == 1) 
                           {
                              System.out.print("Nonexistant");
                           } 
                           else
                           {
                              if(counter == 2) // The only time the counter is gonna equal 0 is at 1/1 and x/x, so we set up a gaurd statement only allowing those two instances to pass
                              {
                                 System.out.print(x + " ");//spacing and commas so that the primes aren't just one huge ugly chunk
                              }
                              else //unecessary else statement, but it helps me feel safe that if the code did malfunction, this would do something
                              {
                              }
                           }
                     } 
                     System.out.println();
                     break;
                     
            default: System.out.println("Good Bye");        
            break; 
         
         }// end switch
            
      }while(choice != 4); // end external do while loop

         
   }// end main

}// end class