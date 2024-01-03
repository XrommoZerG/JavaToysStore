import java.io.FileWriter;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        LotteryHandler lotteryHandler = new LotteryHandler();
        lotteryHandler.addToys();

        try {
            FileWriter fileWriter = new FileWriter("toysLotteryResult.txt");

            List<Toy> toys = lotteryHandler.getToys();

            for (Toy toy :
                    toys) {
                fileWriter.write(toy.toString());
            }

            fileWriter.close();
            System.out.println("Запись завершена");
        }catch (Exception e) {
            System.out.println("Возникла ошибка при записи");
        }

        }
    }
