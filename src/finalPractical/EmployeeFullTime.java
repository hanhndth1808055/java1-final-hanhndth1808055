package finalPractical;

public class EmployeeFullTime extends SalaryPolicy {
    public float rate;

    public EmployeeFullTime() {
        this.rate = 4f;
    }

    public float getSalary(){
        return this.rate*this.baseSalary;
    }
}
