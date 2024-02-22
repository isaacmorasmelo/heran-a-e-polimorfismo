package entities;

public class company extends single{
    public int number_employees;

    public company() {
        super();
    }

    public company(String name, double anual_income, double health_expenditures, int number_employees) {
        super(name, anual_income, health_expenditures);
        this.number_employees = number_employees;
    }

    public double companyTax(){
        if (number_employees <= 10){
            return getAnual_income() * 0.16;
        }else {
            return getAnual_income() * 0.14;
        }
    }
    public int getNumber_employees() {
        return number_employees;
    }

    public void setNumber_employees(int number_employees) {
        this.number_employees = number_employees;
    }
}
