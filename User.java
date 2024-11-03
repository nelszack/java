import java.util.Scanner;

public class User {
    private int choice;
    private int numb_guess;
    public Scanner reader;

    public User(Scanner reader) {
        this.choice = 0;
        this.numb_guess = 0;
        this.reader = reader;

    }

    public void user() {
        System.out.println("guess a number between 1-100");
        this.choice = this.reader.nextInt();
    }

    public int getChoice() {
        return choice;
    }

    public int getNumb_guess() {
        return numb_guess;
    }

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void setNumb_guess() {
        this.numb_guess += 1;
    }

}
