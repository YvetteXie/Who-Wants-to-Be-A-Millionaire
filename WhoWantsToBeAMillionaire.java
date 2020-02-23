/* Date: Apr 12, 2018
 * Name: Yvette Xie
 * Teacher: Mr. Chu
 * Description: This game is called Who Wants to be a Millionaire that 
 * lets the users answer the questions and earn prize if they are correct
 */
import java.util.Scanner;
import java.util.Random;
public class WhoWantsToBeAMillionaire{
  public static void main (String args[]){
    
    Scanner sc = new Scanner(System.in);//initializes the scanner and random number generator
    Random random = new Random();
    
    int random1=0, random2, random3, random4, random5, random6;//array and variables declaration
    String[] question = {//store all the questions in an array
      "A soccer game is divided into how many equal parts?",
      "In the Beijing 2008 Olympic Games, how many gold medals did Michael Phelps win?",
      "What is the national sport of Japan?",
      "Which soccer team won the 2006 FIFA world cup in Germany?",
      "Which NFL team overcame a 25-point deficit to win the 2017 Super Bowl?",
      "In what year was the 'Perfect 10' scoring system in gymnastics abandoned?",
      "How many black squares are there on a chessboard?",
      "Who is the all-time leading point scorer in NBA history?",
      "The Heisman Memorial Trophy is awarded annually to the most outstanding player in which college sport?",
      "Which tennis player has won the most men's Grand Slam titles?",
      "Nadia Comaneci took three Olympic gold medals at what tender age?",
      "What are the only two countries south of the equator to win medals at the Winter Olympics Games?",
      "Where did the 'Tiger' in 'Tiger Woods' originate?",
      "Where were the first modern Olympic Winter Games held?",
      "In the 2004 Olympics, two countries appeared for the first time. What were they?",
      "On which day of the year does the Melbourne Cup bring Australia to a standstill?",
      "In what year was the 4-minute mile first achieved?",
      "The Walker Law passed in 1920 in New York was a law regulating which sport?",
      "Which of the following, named for a former Winter Olympic gold medalist, is a real move in figure skating?",
      "How much money is a US Olympic gold medalist awarded?"
    };
    
    String[] option= {//store the options for each question above in a seperate array
      "A.Four quarters  B.Two halves  C.Three periods  D.Five periods",
      "A.6  B.7  C.8  D.12",
      "A.Cricket  B.Baseball  C.Sumo  D.Soccer",
      "A.Italy  B.Germany  C.France  D.Brazil",
      "A.Philadelphia Eagles  B.New York Giants  C.Oakland Raiders  D.New England Patriots",
      "A.1992  B.2000  C.2006  D.2008",
      "A.32  B.40  C.48  D.64",
      "A.Kareem Abdul-Jabbar  B.Michael Jordan  C.Kobe Bryant  D.Karl Malone",
      "A.Basketball  B.Football  C.Swimming  D.Ice hockey",
      "A.Rafael Nadal  B.Pete Sampras  C.Roy Emerson  D.Roger Federer",
      "A.14  B.11  C.18  D.16",
      "A.South Africa and Argentina  B.Australia and Argentina  C.South Africa and New Zealand  D.Australia and New Zealand",
      "A.His performance on the golf course  B.The way he acted as a kid  C.His dad’s military buddy  D.His favorite animal",
      "A.Moscow, Russia  B.Chamonix, France  C.Stockholm, Sweden  D.Salt Lake City, United States",
      "A. Kuwait and Qatar  B.Timor-Leste and Kuwait  C.Cuba and North Korea  D.Qatar and Timor-Leste",
      "A.The last Saturday in October  B.The first Tuesday in November  C.Easter Monday  D.The third Friday in June",
      "A.1989  B.1963  C.1995  D.1954",
      "A.Soccer  B.Football  C.Boxing  D.Wrestling",
      "A.The Fleming Fling  B.The Hamill Camel  C.The Witt Flip  D.The Henie Halo",
      "A.$50,000  B.150,000  C.25,000  D.10,000",
    };
    
    String[] answer = {"B","C","C","A","D","C","A","A","B","D","A","D","C","B","B","B","D","C","B","C"};//store all the correct answers in an array
    
    String[] answerRandom= {"A","B","C","D"};
    final int MAX=14;
    String userAnswer,lifelineOption,finalAnswer="",difficulty,friendAnswer,audienceAnswer;
    int levelOfPrize = 0;//the level of prize will be associated with the array below
    int[] award = {0,500,1000,2000, 3000,5000,7000,10000,20000,30000,50000,100000,250000,500000,1000000};
    int[] generatedNum = new int [14];
    boolean sameQuestion, fifty=true, friend=true, audience=true;
    
    
    System.out.println("Welcome to Who Wants to be A Millionaire!");//Explaining the rules to the player
    System.out.println("");
    System.out.println("Rules:");
    System.out.println("");
    System.out.println("If you answer the answers correctly, you get a higher level of prize, but the money does not accumulate."); 
    System.out.println("If the answer is wrong, you leave the game without any prize.");
    System.out.println("");
    System.out.println("You can walk away with the money you have earned so far or use one of the lifeline options: 50/50, ask a friend, or ask the audience. Each option for lifeline can only be used once.");
    System.out.println("");
    System.out.println("Enter '1' means you are ready to tell your final answer. Enter '-1' to walk away with current prize, '0' to use lifeline. The users cannot walk away after choosing to use lifeline.");
    System.out.println("For the final answer, enter either of “A”, “B”, “C”, or “D”.");
    
    for (int i=0;i<MAX;i++){//the process in this for loop repeats when the users are going to answer a question
      
      if (i<5){//The first five questions are at the easy level
        
        do//the number generator generates a number and compare it to all the numbers that have been generated
        {
          sameQuestion = false;//this boolean is set to false before the number is generated so that the comparison is valid every time a new random number is generated
          random1 = random.nextInt(7)+1;//the number will be between 1 to 7, representing all the 7 easy questions in the database
          
          for (int c=0;c<5;c++){//The random number is compare to the first five number is the generatedNum aray
            
            if (random1 == generatedNum [c]){//if the number has been generated, the boolean is set to true, and a new number will be generated until it is different from the old ones
              
              sameQuestion = true;
            }
          }
          
        }while (sameQuestion);//if the number is generated, the loop repeats and generate a new number
        
        difficulty = "easy";//the difficulty is given a new value for display
      }
      
      
      else if (i<11){//the sixth to eleventh questions are at medium level
        
        do//the same process for easy questions is executed
        {
          sameQuestion = false;
          random1 = random.nextInt(8)+8;//the random number will be between 8 to 15, meaning there are 8 medium questions in the database to be randomly displayed
          
          for (int c=0;c<11;c++){
            
            if (random1 == generatedNum [c]){
              
              sameQuestion = true;
            }
            
          }
          
        }while (sameQuestion);
        
        difficulty = "medium";
      }
      
      else {//the following procedure is for the 3 hard questions
        
        do
        {
          sameQuestion = false;
          random1 = random.nextInt(5)+16;//the number will be between 16 to 20, indicating that there are 5 hard questions in the database
          
          for (int c=0;c<MAX;c++){
            
            if (random1 == generatedNum [c]){
              
              sameQuestion = true;
            }
            
          }
          
        }while (sameQuestion);
        
        difficulty = "hard";
      }
      
      generatedNum[i] = random1;//after the question is decided, the random number will be placed in this array so that no question will be repeated
      
      System.out.println("");//the computer prints the difficulty of this question, the question, and the options
      System.out.println("The level of difficulty is: " + difficulty);
      System.out.println("");
      System.out.println("Question " + (i+1) + ": " + question[random1-1]);
      System.out.println(option[random1-1]);
      
      System.out.println("");//the computer asks the user for how they are going to answer this question
      System.out.println("If you want to answer the question, enter '1'");
      System.out.println("If you want to walk away, enter '0'");
      System.out.println("If you want to use lifeline, enter '-1'");
      
      userAnswer = sc.nextLine();//collect input from the user and store it in the String variable userAnswer
      
      System.out.println("");
      while (!(userAnswer.equals("1") || userAnswer.equals("0") || userAnswer.equals("-1"))){//validation loop, the computer will keep asking for a valid value if the input is not acceptable
        
        System.out.println("Invalid value. Please enter again.");
        userAnswer = sc.nextLine();
        
      }
      
      
      
      if (userAnswer.equals("1")){//if the players choose to answer the question right away, the computer will collect the input for the final answer and store it
        
        System.out.println("Please enter your final answer for the question.");
        finalAnswer = sc.nextLine();
        
      }
      
      else if (userAnswer.equals("0")){//if the players decide to walk away, the for loop breaks and the game ends immediately 
        System.out.println("Maybe it is the right time to leave..");
        break;
        
      }
      
      else if (userAnswer.equalsIgnoreCase("-1")){//if the players want to use lifeline, the computer checks if all the options have been used
        
        if (!(fifty || friend || audience)){//if none of the booleans are true
          
          System.out.println("All lifeline options have been used.You have to take a guess!");//the players will have to decide their final answer by themselves
        }
        
        else {//if there are options left, they can use whatever options that are still available
          
          do//the do while loop allows the user to choose again when they first choose the option that is not available already
          {
            System.out.println("You still have the following options avaliable:");//shows the players all the options available
            
            if(fifty){
              System.out.println("50/50: 50% chance of getting the right answer ");
            }
            
            if(friend){
              System.out.println("Ask a friend: 80% chance of getting the right answer ");
            }
            
            if(audience){
              System.out.println("Ask the audience: 60% chance of getting the right answer");
              
              System.out.println(" ");
              System.out.println("Enter'1' to use 50/50, enter'2' to ask a friend, enter'3' to ask the audience.");//ask the players for what option they want to use
            
            }
            
            lifelineOption = sc.nextLine();//collect user input and store it
            
            while (!(lifelineOption.equals("1") || lifelineOption.equals("2") || lifelineOption.equals("3"))){//validation loop, the computer will keep asking for a valid value if the input is not acceptable
              
              System.out.println("Invalid value. Please enter again.");
              lifelineOption = sc.nextLine();
              
            }
            
            
            if (lifelineOption.equals("1")){//the players want to use 50/50 if they enter '1'
              
              if (fifty){//if the option has not been used
                
                do//keep generating a number between 0-4 while the letter at the position of this random number in array answerRandom is the same as the random number
                {
                  random2 = random.nextInt(4); 
                  
                }while(answerRandom[random2].equals(answer[random1-1]));//so that the two answers displayed will be different
                
                if (answer[random1-1].compareTo (answerRandom[random2]) < 0){
                  
                  System.out.println("The correct answer is between " + answer[random1-1] + " and " + answerRandom[random2]);//display the random answer and correct answer in alphabetical order
                }
                
                else{
                  System.out.println("The correct answer is between " + answerRandom[random2] + " and " + answer[random1-1]);
                }
                
                fifty=false;//set fifty to false so it cannot be used again
                break;//leave the do while for lifeline
                
              }
              
              else {//if 50/50 has been used, the user will be directed to the beginning of the do while loop and re-enter their choice
                System.out.println("50/50 has been used, you have to select another option.");
                System.out.println("");
              }
              
            }
            
            else if(lifelineOption.equals("2")){//if the players choose to ask a friend, the computers checks if it has been used
              
              if(friend){//if it has not been used
                
                random3 = random.nextInt(100);//the computer generates a number between 0-99
                
                if (random3<80){//if the number is between 0-79, which is 80% of the time
                  friendAnswer = answer[random1-1];//the answer of the friend will be the correct answer
                }
                
                else {//if the number is between 80-99
                  
                  do//the answer will be a random wrong answer
                  {
                    random4 = random.nextInt(4);//the computer generates a number between 0-3 that represents 'A','B','C','D' in the answerRandom array
                    
                  }while(answerRandom[random4].equals(answer[random1-1]));//it cannot be the same as the correct answer
                  
                  friendAnswer = answerRandom[random4];//store the letter in friendAnswer
                }
                
                System.out.println("Your friends thinks " + friendAnswer + " is the right one!");//tell the players what their friends think
                friend=false;//set to false so it cannot be used again
                break;//exist the do while loop
              }
              
              else{//if ask a friend has been used, the user will be directed to the beginning of the do while loop and re-enter their choice
                System.out.println("You have asked a friend already, consider other options!");
                System.out.println("");
              }
              
            }
            
            else if(lifelineOption.equals("3")){//if the players choose to ask the audience, the computers checks if it has been used
              
              if(audience){//if this option is still available
                
                random5 = random.nextInt(100);////the computer generates a number between 0-99
                
                if (random5 < 60){//if the number is between 0-59, which is 60% of the time
                  audienceAnswer = answer[random1-1];//the correct answer is stored in audienceAnswer
                }//end of if statement
                
                else{//if the number is between 60-99
                  do//the answer will be a random wrong answer
                  {
                    random6 = random.nextInt(4);//the computer generates a number between 0-3 that represents 'A','B','C','D' in the answerRandom array
                    
                  }while(answerRandom[random6].equals(answer[random1-1]));//the random answer cannot be the same as the correct answer
                  
                  audienceAnswer = answerRandom[random6];//assign the random answer to audienceAnswer
                }
                
                System.out.println("The audience think " + audienceAnswer + " is the right one!");//shows the players the answer of the audience
                audience=false;//set to false so it cannot be re-used
                break;//exist the do while loop
              }//end of if statemnt where this option is available
              
              else{//if ask the audience has been used, the user will be directed to the beginning of the do while loop and re-enter their choice
                System.out.println("You have asked the audience! Use another option!");
                System.out.println("");
              }
              
            }//end of else statement where the players choose to ask the audience
            
          }while(fifty || friend || audience);//prevents the user from entering the option that is not avaliable and gives them another chance to enter
          
        }//end of else-if statement where there is available lifeline option
        
        System.out.println("");
          System.out.println("Your final answer is: ");//ask for the final answer from the player after the lifeline assistance is given
          finalAnswer = sc.nextLine();//collect input and store it in string finalAnswer
        
      }//end of else-if statement to use lifeline
      
       while (!(finalAnswer.equalsIgnoreCase ("A") || finalAnswer.equalsIgnoreCase ("B") || finalAnswer.equalsIgnoreCase ("C") ||finalAnswer.equalsIgnoreCase ("D"))){
          //validation loop, the computer will keep asking for a valid value if the input is not acceptable
          
          System.out.println("Invalid value, please enter again.");
          finalAnswer = sc.nextLine();
          
        }//end of while loop
        
        if(finalAnswer.equalsIgnoreCase(answer[random1-1])){//if the answer matches the letter in the answer array
          
          levelOfPrize ++;//add up the prize level and tell the players their current amount of prize
          System.out.println("You got it right!");
          System.out.println("You have earned $" + award[levelOfPrize] + " by now!");
          
        }
        
        else{//if the answer is incorrect, they lose all the prize and the game immediately ends
          
          levelOfPrize = 0;
          System.out.println("You got it wrong!");
          System.out.println("The correct answer is " + answer[random1-1]);//show the correct answer
          System.out.println(" ");
          System.out.println("All the prize are gone now...");
          break;
          
        }
      
    }//end of for loop
    
    System.out.println(" ");
    System.out.println("-------------------------END OF GAME----------------------------");
    System.out.println("");
    
    if(levelOfPrize > 0){//congrat the players and tell them how many prizes they have earned
      System.out.println("CONGRATULATIONS! You are going to walk away with $" + award[levelOfPrize] + "!");
    }//end of if statement
    
    else {//inform the players if they don't have any prize
      System.out.println("Unfortunately, you are walking away with no prize");
    }//end of else statement
    
  }//end of main method
}//end of class