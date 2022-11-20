/** 
 *  Hello!
 *  This is a program which gives the user options and the user chooses an option which does a variety of things.
 *  The functionality of the things are printed in the program and explained thoroughly with comments and such. Have fun!
 *  @author Loris Duka loris_21@outlook.com 
 *  @version 2019/11/23 
 *  Licensed under the GNU public license open source agreement.
 */
import java.io.*;                   // Importing all the commands of the io Java package
import java.util.Random;

public class School_Project {  
	public static int factorial(int n) { //This is used to calculate the factorial of a number in option 3.
		if(n==1) return 1; // It is using the recursion method.
		else return n*factorial(n-1); //This puts (n-1) as the initial value and proceeds to find the factorial, ex. n*(n-1)*((n-1)-1)....*2*1.
	}
    public static void main(String[] args) throws IOException // Declares that an error (exception) may occur
    {
        // Prepare for input
        InputStreamReader isr = new InputStreamReader(System.in); // Variable (object) reading the keystrokes
        BufferedReader br = new BufferedReader(isr);              // Variable (object) translating the input stream
        String inData;
        
        //Declare Variables
        int option=0;
        
        //Option 1 Variables
        double opt1Sum=0, opt1Avg=0, opt1Prod=1, opt1Num=0, stdDev1=0, stVar1=0; //Option 1 real inputed numbers
        double[]opt1Array=new double[6]; 
        
        //Option 2 Variables
        double opt2Sum=0, opt2Avg=0, opt2Prod=1, stdDev2=0, stVar2=0; //Option 2 inputed numbers
        int counter=0;
        double[]opt2Array=new double[22];
        
        //Option 3 Variables
        boolean opt3Check=false;
        int opt3Num, opt3Sum=0, opt3Avg=0;
        int[]opt3Array=new int[5];
        
        //Option 4 Variables
        int randomNumOpt4=0, rangeOpt4=0, opt4Num, counterOpt4=1;
        Random randomOpt4 = new Random();
        
        //No Option 5 Variables
        
        //Option 6 Variables
        double a = 0, a2 = 0;
        
        //Option 7 Variables
        String exit;
        String actualExit;
        
        //PROGRAM STARTS HERE
        
        System.out.println("Hello and welcome to my option chooser." + 
        "\nIn this option chooser you will choose options." +
        "\nOption 1 Asks the user to input 6 real numbers and then displays their sum,product, statistical variance and standard deviation. " + 
        "\nOption 2 Calculates and displays the list of all integer numbers between 0 and 500 which are the exact square of another integer and also calculates the sum, average, variability and standard deviation of all squares which you discover. " +
        "\nOption 3 Asks the user to input 5 positive integers between 0 and 15. Proceeds to calculate and display the average of the 5 integers, as well as the factorial of the integer which is closest to the group's average. " +
        "\nOption 4 The program picks a random integer between 0 and 65 and then asks the user to guess what it is. Every time the user misses a guess the program tells them if their guess was higher or lower than the target number. " +
        "\nOption 5 Researches automorphic numbers. Calculates all automorphic numbers between 0 and 10000 (3 exist). " +
        "\nOption 6 Finds Pythagorean triples. There are exactly 16 primitive Pythagorean triples involving integers with a hypotenuse value smaller or equal to 100. " +
        "\nOption 7 Ends the program. ");
        
        do {System.out.println("Please choose the option: ");
        inData = br.readLine(); // Reads the user's input and stores it in variable 'inData'                
        option = Integer.parseInt(inData);   
        if (option == 1){
          System.out.println("Input 6 real numbers:");
          for(int i = 0; i < 6; i++){
           inData = br.readLine(); // Reads the user's input and stores it in variable 'inData'                
           opt1Num = Double.parseDouble(inData); // Inputs the 6 numbers.
           opt1Array[i]=opt1Num; // Makes an array with the numbers inputed.
           opt1Prod *= opt1Array[i]; //Multiplies all numbers in the array.
           opt1Sum += opt1Array[i]; //Finds the sum of all numbers in the array.
        }
           System.out.println("Your Sum is: " +  opt1Sum + "\nYour Product is: " + opt1Prod);
           opt1Avg = opt1Sum/6;
           opt1Sum = 0;
        for(int i = 0; i < 6; i++){
           opt1Array[i]=Math.pow(opt1Array[i] - opt1Avg,2);
           opt1Sum += opt1Array[i];
        }
           stdDev1 = Math.sqrt(opt1Sum/6);
           stVar1 =  opt1Sum/6;
           System.out.println("Your Standard Deviation is: " + stdDev1 + "\nYour Statistical Variance is: " + stVar1);
       }else if(option == 2){
        System.out.println("And the numbers are: ");
          for(int i = 500; i > 0; i--){ 
           if((Math.sqrt(i)*10)%10==0){ //Checking if it's a natural number.
           opt2Array[counter]=i;
           if(i==1)  //Just an extra thing for the numbers to end with ".".
            System.out.print(opt2Array[counter] + ".");
           else
            System.out.print(opt2Array[counter] + ", ");
           counter++; //Adding 1 to the counter which is part of the array.
        }
       }
         for(int i = 0; i < 22; i++){             
           opt2Prod *= opt2Array[i];  //Doing the same thing as option 1.
           opt2Sum += opt2Array[i];
        }
        System.out.println("\nYour Sum is: " +  opt2Sum + "\nYour Product is: " + opt2Prod);
        opt2Avg = opt2Sum/6;
        opt2Sum = 0;
        for(int i = 0; i < 22; i++){
           opt2Array[i]=Math.pow(opt2Array[i] - opt2Avg,2);
           opt2Sum += opt2Array[i];
        }
        stVar2 = opt2Sum/6;
        stdDev2 = Math.sqrt(stVar2);
        System.out.println("Your Standard Deviation is: " + stdDev2 + "\nYour Statistical Variance is: " + stVar2);
      }else if(option == 3){
    	  System.out.println("Please choose the numbers between 0 and 15: ");
          for(int i=0; i<5; i++) { //Chooses 5 numbers with a while loop by making a counter which starts at 0 and ends at 4.
              while(opt3Check==false) { //This makes sure the user doesn't input any number outside of 0 and 15.
            	  inData = br.readLine(); // Reads the user's input and stores it in variable 'inData'                
                  opt3Num = Integer.parseInt(inData);
                  if(opt3Num<=15 && opt3Num>=0) {
                  opt3Check=true; //This stops the while loop, thus starting the second number.
                  opt3Array[i]=opt3Num;
                  opt3Sum += opt3Array[i];
                  }else System.out.println("I said a number between 0 and 15: ");
              }
              opt3Check=false; //This restarts the for loop.
              }opt3Avg=opt3Sum/5;
              System.out.println("The factorial of the average which is " + opt3Avg + " is equal to: " + factorial(opt3Avg)); //We are calling the factorial class stated on the beginning of the code.
          }else if(option == 4) {
        	  rangeOpt4 = 65;
        	  randomNumOpt4 =  ((int)(rangeOpt4 * randomOpt4.nextDouble())); //Generates a random number.
              do {
            	  System.out.println("Hey buddy, guess a number from 0 to 65: ");
            	  inData = br.readLine(); // Reads the user's input and stores it in variable 'inData'                
                  opt4Num = Integer.parseInt(inData); //Inputing guess.
              if (opt4Num == randomNumOpt4) {
            	  System.out.println("Oh nice, you chose the right number good job!\nIt only took you like what " + counterOpt4 + " tries?");
              }else if (opt4Num < randomNumOpt4 && opt4Num>0) {
            	  System.out.println("Oh nice, you're wrong. Go a bit higher, maybe you'll guess right this time.");
            	  counterOpt4+=1; //Adding a try.
              }else if (opt4Num > randomNumOpt4 && opt4Num<65) {
            	  System.out.println("Oh nice, you're wrong. Go a bit lower, maybe you'll guess right this time.");
            	  counterOpt4+=1; //Adding a try.
              }else {System.out.println("Don't try anything funny buddy, pal, amigo. ");
                  counterOpt4+=1;} //Adding a try.
              } while (opt4Num !=randomNumOpt4);
          }else if(option == 5) {
        	  System.out.println("There are in fact 9 automorphic numbers which are: ");
        	    for(int i=0; i<=10000; i++) { 
        	    	if(i<10) {
        	    		if((i*i) % 10 == i) {	//Example: i == 5 => 5*5 == 25%10 == 5 == i
        	    			System.out.print(i + ", ");
        	    			}
        	        }else if(i>=10 && i<100) {  //Same example but bigger numbers.
        	    		if((i*i) % 100 == i) {
        	    			System.out.print(i + ", ");
        	    		}
        	    	}else if(i>=100 && i<1000) {  //Same example but bigger numbers.
        	    		if((i*i) % 1000 == i) {
        	    			System.out.print(i + ", ");
        	    	}
        	    	}else if(i>=1000 && i<10000) {  //Same example but bigger numbers.
        	    		if((i*i) % 10000 == i) {
        	    			System.out.print(i + ". \n");
        	    	}
        	    		}
        	    }
          }else if(option == 6) {
              System.out.println("And the pythagorean triples are: ");
              for(int c=5; c<=100; c++) { //It starts at 5 because it is the lowest of the c pythagorean values; c is lower or equal to 100 because that is our limit.
                  for(int b=3; b<c; b++) { //It starts at 3 becuase it is the lowest of the b pythagorean values; b is always lower than c because math says it is.
                      a = Math.sqrt((c*c)-(b*b));  //Pythagorean value of a.
                      if((a*10)%10==0) { //Checks if a is a natural number.
                          if(a<b) { //Checks for duplicates.
                              for(int i=2; i<=20; i++) { //We need a for loop to check if each value is a multiple.
                                  if(((a/i)*10)%10 == 0 && ((b/i)*10)%10 == 0 && ((c/i)*10)%10 == 0) { //If all are natural numbers then we have a multiple triple.
                                      a2=Math.sqrt(((c/i)*(c/i) - (b/i)*(b/i)))*i; //We use a2 to not mess with the value of a so we're sure nothing bad happens.
                                      if(((a2)*10)%10==0 && a2 != 0) { //Checking if it is a natural number.
                                          System.out.print("[" + (int)(a2) + " " + b + " " + c +"]\n");  //Duplicate multiple triples.
                                          break;
                                      }
                                  }else if(i == 20){
                                  System.out.print((int)(a) + " " + b + " " + c + " " + "\n"); //Normal triples.
                                  break;
                                  }
                              }
                          }else System.out.print("[" + (int)(a) + " " + b + " " + c +"]\n"); //Multiple Triples.
                      } 
                  }
              }
          }else if(option == 7){
        System.out.println("Leaving so soon? \nAre you sure you want to exit?\nYes or No?"); 
        exit = br.readLine(); //Asking for a yes or a no. 
        actualExit = exit.toLowerCase(); //Accepting both values wether they have lowercase or uppercase. (Extra work for extra points *wink wink*.)
        if(actualExit.contains("yes")){
        System.exit(0);
      }else if(actualExit.contains("no")){ //If no then it just goes back to choosing the options.
        }else{ //Fail safe for any people who like trying funny things.
        System.out.print("Don't mess with me please. :C\n");
      }
    }
  } while(true); //Makes sure the program runs infinitely until we do System.exit(0);.
 }}           