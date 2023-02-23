import java.text.DecimalFormat;
import java.util.Scanner;

public class Program {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter symbol: ");
        String symbol = scanner.nextLine();
        System.out.println("Enter neutroner: ");
        int neutroner = scanner.nextInt();
        System.out.println("Enter protoner: ");
        int protoner = scanner.nextInt();
        System.out.println("Enter massa: ");
        double massa = scanner.nextDouble();

        Element element = new Element(symbol, neutroner, protoner, massa);
        DecimalFormat df = new DecimalFormat("###.######");
        System.out.println(element.getSymbol() + " Bindningsenergi: " + df.format(element.getBindningsernergiInMeV()));


    }
}
