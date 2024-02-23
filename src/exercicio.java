import entities.TaxPayer;
import entities.company;
import entities.single;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        single single = new single();
        company company = new company();
        TaxPayer TaxPayer = new TaxPayer();
        List<TaxPayer> taxPayer = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int quantity = sc.nextInt();

        for (int i = 0; i < quantity; i++) {
            System.out.println("Tax payer #" + (i+1) + " data:");

            System.out.print("Individual or company (i/c)? ");
            char ic = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();



            if(ic == 'i'){
                System.out.print("Health expenditures:");
                double healthExpenditures = sc.nextDouble();
                TaxPayer = new single(name,anualIncome,healthExpenditures);

                single.SingleTax();
                taxPayer.add(single);
            } else{
                System.out.print("Number of employees:");
                int employees = sc.nextInt();

                 TaxPayer = new company(name,anualIncome,employees);
                company.CompanyTax();
                taxPayer.add(single);
            }

        }

        System.out.println("TAXES PAID:");
        for (TaxPayer i : taxPayer) {
            double tax = TaxPayer.Tax();
            System.out.println(TaxPayer.getName() + ": $ " + tax);
            sum += tax;
        }

        System.out.println("TOTAL TAXES: $" + sum);
    }
}
