package entities;

public class single extends TaxPayer{
    private double healthExpenditures;

    public single() {
        super();
    }

    public single( String name, double anualIncome, double healthExpenditures1) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures1;
    }

    public double SingleTax(){
        if (healthExpenditures > 0){
            return Tax()-healthExpenditures*0.5;
        } else{
            return Tax();
        }
    }

    public single(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
}
