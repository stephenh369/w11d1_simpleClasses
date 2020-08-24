public class Printer {
    private int paper;
    private int toner;
    private int printed;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper() {
        return this.paper;
    }

    public int getToner() { return this.toner; }

    public int getPrinted() {
        return printed;
    }

    public void print(int pages, int copies) {
        if (this.paper >= pages * copies) {
            int printed = pages * copies;
            this.toner -= printed;
            this.paper -= printed;
            this.printed = printed;
        }
    }
}
