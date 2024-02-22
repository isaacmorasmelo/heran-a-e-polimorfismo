import entities.single;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        single single = new single();
        List<single> Single = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.println("Tax payer #" + i+1 + "data:");

            System.out.print("Individual or company (i/c)? ");
            char ic = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            System.out.print("Health expenditures:");
            double healthExpenditures = sc.nextDouble();

            Single.add(single(name,anualIncome,healthExpenditures));
        }
    }
}
