public class Results {

    public Results() {

    }

    public String result(int uchoice, int randint) {
        if (uchoice == randint) {
            return "correct";
        } else if (uchoice > randint) {
            return "lower";
        } else if (uchoice < randint) {
            return "higher";
        } else {
            return "error";
        }
    }
}
