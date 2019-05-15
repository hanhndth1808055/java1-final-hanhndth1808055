package finalPractical;

public class EmployeePartime extends SalaryPolicy {
    public float rate;

    public EmployeePartime() {
        this.rate = 2.5f;
    }

    public float getSalary(){
        return this.rate*this.baseSalary;
    }
}
