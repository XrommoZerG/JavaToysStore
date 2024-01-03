public class Toy {
    private static int counter = 1;
    private final int id;
    private final String name;
    private int rate;

    public Toy(String name, int rate) {
        this.id = counter;
        this.name = name;
        this.rate = rate;

        counter++;
    }

    public int getRate() {
        return rate;
    }

    public void lowerRate() {
        this.rate--;
    }

    //@Override
    public int compareTo(Toy o) {
        return o.getRate() - this.getRate();
    }

    @Override
    public String toString() {
        return "Id: " + this.id + "; Name: " + this.name + "\n";
    }
}
