import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class LotteryHandler {
    Queue<Toy> toyQueue = new PriorityQueue<>(Toy::compareTo);

    public void addToys() {
        toyQueue.add(new Toy("Винипух", 3));
        toyQueue.add(new Toy("Фунтик", 5));
        toyQueue.add(new Toy( "Мишка", 2));
    }

    public void addToy(String name, int rate) {
        toyQueue.add(new Toy(name, rate));
    }

    public List<Toy> getToys() {
        List<Toy> toys = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Toy toy = toyQueue.poll();
            toys.add(toy);
            assert toy != null;
            toy.lowerRate();
            toyQueue.add(toy);

        }

        return toys;
    }
}
