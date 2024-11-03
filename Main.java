import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        User user = new User(reader);
        Comp comp = new Comp();
        Results results = new Results();
        Stats stats = new Stats();
        stats.loadFile("score.txt");
        stats.getStats();
        comp.setList();
        comp.setNumb();
        user.user();
        user.setNumb_guess();
        while (user.getChoice() != comp.getNumb()) {
            System.out.println(results.result(user.getChoice(), comp.getNumb()));
            user.user();
            user.setNumb_guess();
        }
        System.out.println(results.result(user.getChoice(), comp.getNumb()));
        System.out.println(String.format("you got it in %d guesses", user.getNumb_guess()));
        reader.close();
        stats.saveFile("score.txt", Integer.toString(user.getNumb_guess()));

    }



}
