package entities;

public class TaxPayer{
    private String name;
    private double anualIncome;

    public TaxPayer() {
    }

    public TaxPayer(String name, double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }


    public double Tax(){
        if (anualIncome>20000){
            return anualIncome*0.25;
        } else {
            return anualIncome*0.15;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(double anualIncome) {
        this.anualIncome = anualIncome;
    }
}
