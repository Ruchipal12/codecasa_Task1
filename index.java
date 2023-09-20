
import java .util.Random;
import java.util.Scanner;
class Game{
  public int number;
  public int inputNumber;
  public int noOfGuesses=0; 
  public int getNoOfGuesses(){
    return this. noOfGuesses;
  }
  
public void setNoOfGuesses(int noOfGuesses){
    this.noOfGuesses=noOfGuesses;
}

   Game(){
Random rand = new Random();
this.number=rand.nextInt(100);
 }   
void takeuserInput(){
  System.out.println("GUESS THE NUMBER:");
Scanner sc=new Scanner(System.in);
inputNumber=sc.nextInt();
}
boolean isCorrectNumber(){
noOfGuesses++;
if (inputNumber==number){
    System.out.format("YES YOU  GUESSED IT RIGHT,IT WAS %d\nYOU GUESSED IT IN %d ATTEMPTS",number ,noOfGuesses);
    return true;
}
else if(inputNumber<number){
    System.out.println("TOO LOW....TRY AGAIN.");
}
else if (inputNumber>number){
    System.out.println("TOO HIGH....TRY AGAIN.");
}
return false;
}
}
public class GuessTheNumber{
    public static void main(String[] args) {
        Game g=new Game();
        boolean b=false;
        while(!b){
            g.takeuserInput();
            b=g.isCorrectNumber();
        
        }
    }
}
    

