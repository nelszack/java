import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Stats {
    private ArrayList<Integer> list;

    public Stats() {
        list = new ArrayList<>();

    }

    public void loadFile(String fileName) {
        try {
            BufferedReader file = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = file.readLine()) != null) {
                this.list.add(Integer.parseInt(line.trim()));
            }
            file.close();

        } catch (Exception e) {
            System.out.println("error reading file");
        }

    }

    public void saveFile(String fileName, String guess) {
        try {
            BufferedWriter file = new BufferedWriter(new FileWriter(fileName, true));
            file.write(guess + "\n");
            file.close();
        } catch (Exception e) {
            System.out.println("error writing to file");
        }
    }

    public void getStats() {
        int sum = 0;
        int max = 0;
        int min = 100;
        int size = this.list.size();
        for (Integer i : this.list) {
            sum += i;
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        if (size != 0) {
            System.out.println(
                    String.format("the most guesses is %d\nthe smallest is %d guesses\nthe average is %d guesses", max,
                            min, sum / size));
        } else {
            System.out.println("no stats to display");
        }
    }

}
