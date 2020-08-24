public class Printer {
    private int paper;
    private int printed;

    public Printer(int paper) {
        this.paper = paper;
    }

    public int getPaper() {
        return paper;
    }

    public int getPrinted() {
        return printed;
    }

    public void print(int pages, int copies) {
        if (this.paper >= pages * copies) {
            int printed = pages * copies;
            this.paper -= printed;
            this.printed = printed;
        }
    }
}
