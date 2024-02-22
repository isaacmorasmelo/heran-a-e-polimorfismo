package entities;

public class single {
    private String name;
    private double anual_income;

    private double Health_expenditures;

    public single() {
    }

    public single(String name, double anual_income, double health_expenditures) {
        this.name = name;
        this.anual_income = anual_income;
        Health_expenditures = health_expenditures;
    }

    public double singleTax(){

        if(anual_income > 20000 && Health_expenditures > 0){
            return (anual_income * 0.25)-(Health_expenditures * 0.5);
        }
        else if(anual_income > 20000){
            return anual_income * 0.25;
        }
        else{
            return anual_income * 0.15;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnual_income() {
        return anual_income;
    }

    public void setAnual_income(double anual_income) {
        this.anual_income = anual_income;
    }

    public double getHealth_expenditures() {
        return Health_expenditures;
    }

    public void setHealth_expenditures(double health_expenditures) {
        Health_expenditures = health_expenditures;
    }
}
