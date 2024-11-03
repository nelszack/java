import java.util.Random;
import java.util.stream.IntStream;
import java.util.ArrayList;

public class Comp {
    private int numb;
    private ArrayList<Integer> list;

    public Comp() {
        list = new ArrayList<>();
    }

    public void setNumb() {
        this.numb = this.list.get(new Random().nextInt(100));
    }

    public void setList() {
        for (int _ : IntStream.range(0, 100).toArray()) {
            this.list.add(new Random().nextInt(1, 100));
        }

    }

    public int getNumb() {
        return this.numb;
    }
}
