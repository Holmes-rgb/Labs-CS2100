import java.util.Scanner;

public class Average {
    private int[] data;
    private double mean;
    public final int NUM_SCORES = 5;

    public Average(){
        data = new int[NUM_SCORES];
    }
    public void getUserData(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < NUM_SCORES; i++){
            System.out.println("Enter score " + (i+1) + " :");
            data[i] = scanner.nextInt();
        }
    }
    public void calculateMean(){
        double total = 0;
        for (int i = 0; i < NUM_SCORES; i++){
            total += data[i];
        }
        mean = total/NUM_SCORES;
    }
    @Override
    public String toString(){
        StringBuilder sData = new StringBuilder();
        for (int i = 0; i < NUM_SCORES; i++){
            sData.append(data[i] + ", ");
        }
        return String.format("Data: [%s] \n Mean: %f", sData, mean);
    }
}