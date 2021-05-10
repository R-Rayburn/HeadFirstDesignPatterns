import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {
    void brew() { System.out.println("Dripping coffee through filter"); }
    void addCondiments() { System.out.println("Adding sugar and milk"); }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like Milk and Sugar with your coffee (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error with trying to read answer");
        }

        if (answer == null) return "no";
        return answer;
    }
}
