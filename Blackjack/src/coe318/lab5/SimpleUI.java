package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        System.out.println("House holds:");
        System.out.println(game.getHouseCards().toString());
        System.out.println("You hold:");
        System.out.println(game.getYourCards().toString());
        //FIX THIS
    }

  @Override
    public boolean hitMe() {
        System.out.println("Another Card? ");
        String inp = user.nextLine();
        if(inp.equals("n"))
            return false;
        else if(inp.equals("y"))
        {
            return true;
        }
        return false;
    }

  @Override
    public void gameOver() {
        System.out.println("Game over");
        display();
        System.out.println("Your Score:" + game.score(game.getYourCards()));
        System.out.println("House Score:" + game.score(game.getHouseCards()));  
        //FIX THIS
    }

}