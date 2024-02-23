package entities;

public class company extends TaxPayer{
    public int number_employees;

    public company() {
    }

    public company(String name, double anualIncome, int number_employees) {
        super(name, anualIncome);
        this.number_employees = number_employees;
    }

    public double CompanyTax(){
        if (number_employees<=10){
            return getAnualIncome()*0.16;
        } else{
            return getAnualIncome()*0.14;
        }
    }

    public company(int number_employees) {
        this.number_employees = number_employees;
    }
}
