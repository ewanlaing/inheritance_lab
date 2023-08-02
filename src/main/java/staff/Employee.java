package staff;

public abstract class Employee {
    private String name;
    private String NINumber;

    private double salary;

    public Employee (String name, String niNumber, double salary) {
        this.name = name;
        this.NINumber = niNumber;
        this.salary = salary;
    }

    public void raiseSalary(double amount){
        if (amount > 0) {
            this.salary += amount;
        }
    }

    public double payBonus(){
        return this.salary/100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
    }

    public String getNINumber() {
        return this.NINumber;
    }

    public double getSalary(){
        return this.salary;
    }


}
