import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Guesser{
    int guessNum;
   int  guessingNumber(){
        System.out.println("Please guess one number");
        Scanner sc = new Scanner(System.in);
        guessNum=sc.nextInt();
        return guessNum;
    }
}
class Player{
    int guessNum;
   int guessingNumber(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Kindly guess the number");
        guessNum=sc.nextInt();
        return guessNum;
    }
}

class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

   void collectNumFromGuessor(){
            Guesser g=new Guesser();
            numFromGuesser=g.guessingNumber();
    }
  void  collectNumFromPlayers(){
        Player p1=new Player();
        Player p2= new Player();
        Player p3=new Player();
        numFromPlayer1=p1.guessingNumber();
        numFromPlayer2=p2.guessingNumber();
        numFromPlayer3=p3.guessingNumber();
    }
   void compare(){
        if(numFromPlayer1==numFromGuesser){
            if(numFromGuesser==numFromPlayer2&&numFromGuesser==numFromPlayer3){
                System.out.println("All Player won the match");
            }
            else if (numFromGuesser==numFromPlayer2){
                System.out.println("Player1 and player2 both won the game");
            }
            else if (numFromGuesser==numFromPlayer3){
                System.out.println("Player1 and player3 both won the game");
            }
            else{
                 System.out.println("player1 won the game");
            }
           

        }
      else  if(numFromPlayer2==numFromGuesser){
            if(numFromGuesser==numFromPlayer3){
                System.out.println("player2 and player3 won the match");
            }
            else{
            System.out.println("player2 won the game");}

        }
        else if(numFromPlayer3==numFromGuesser){
            System.out.println("player3 won the game");

        }
        else{
            System.out.println("Game Lost");
        }

    }
}
public class miniproject{
public static void main(String[] args) {
    System.out.println("Game Started");
    Umpire um =new Umpire();
    um.collectNumFromGuessor();
    um.collectNumFromPlayers();
    um.compare();
    System.out.println("Game end");
}
}