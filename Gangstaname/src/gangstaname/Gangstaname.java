/*//

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gangstaname;

/**
 *
 * @author Kelly
 */
import java.util.Scanner;
import java.util.Random;

public class Gangstaname {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) 
    {    
                
        Scanner inputNumber = new Scanner(System.in); // Int
        Scanner inputText = new Scanner(System.in);// String
        
        System.out.println("How many stage names do you need?");
        int numberOfNames;// an Int to get the number of stages from user.
        
        try
        {
            numberOfNames = inputNumber.nextInt();
        }catch(Exception exception)
        {
            //try and catch existing incase my user input another character
            System.out.println("Input was not a number, you must start again.");
            return; //return is used to exit from a method avoiding crash
        }
          
        Gang [] g = new Gang[numberOfNames];//multiple array just avoiding add equal gansta names at the same stage.
        String[] gangsta = {"diddy","izzie","diarmo","Danger","Mouse","crazy8","twopack","biggy"};
        String[] gangsta2 = {"guggy","inny","gigi","elcamino","viper","heisenburg","dizzy", "rascal"};
        Random gRand = new Random();       
        
        for(int i = 0; i <numberOfNames; i++)//for loop to get user names, based in how many stages
        {
            g[i] = new Gang ();
            System.out.println("   ");
            System.out.println("Next, enter name["+ (i+1) +"]."); 
            g[i].userName = inputText.nextLine();
            
            if(g[i].userName.isEmpty())
            {
            System.out.println("You must try again! enter name["+ (i+1) +"].");
            g[i].userName = inputText.nextLine();
            }
            g[i].addOn = gangsta [gRand.nextInt(gangsta.length)];
            g[i].addOn2 = gangsta2 [gRand.nextInt(gangsta2.length)];
            //g[i].indexOfLastName = g[i].allNames.length-1;
            g[i].allNames = g[i].userName.toLowerCase().split(" "); //this array to split the names
            g[i].initial = g[i].userName.toUpperCase().charAt(0);  
        }

            System.out.println("   ");                     
            System.out.println("-----------thanks man-----------");
            System.out.println("   ");  
            System.out.println("Ready for your Gangsta name?");
            System.out.println("... ... ...");
            System.out.println("processing");
            System.out.println("... ... ...");
            System.out.println("Checking with Gang");
            System.out.println("   ");
            System.out.println("...there you are:");
            System.out.println("   ");            

        for(int i = 0; i <numberOfNames; i++)//flow the result many times the user asked
        {
        
            System.out.println("YOUR NAME WAS: ");
            System.out.println(g[i].userName);
            System.out.println("   ");
            System.out.println("AND NOW YOU ARE: ");
           
            int indexOfLastName = g[i].allNames.length-1; //using lenght-1 to take the last name inpouted.
            System.out.println(g[i].initial + ". " + g[i].addOn + " " + g[i].allNames[indexOfLastName].toUpperCase() 
                    + " " + g[i].allNames[0] + " " + g[i].addOn2);
            
            System.out.println("   ");
            System.out.println("-----------------");
            System.out.println("   ");
        }
              
        {
            System.out.println("   ");
            System.out.println("If you did not enjoy the Gangstaname...don't be mad... and restart");   
        }
 }
}
