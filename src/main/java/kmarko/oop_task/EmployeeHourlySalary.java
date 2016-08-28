package kmarko.oop_task;

public class EmployeeHourlySalary extends AbstractEmployee implements Salary {

    private int workingHoursDay = 8;
    private double salaryCoefficient = 20.8;

    EmployeeHourlySalary(final String name, final int identifier,
                         final char sex, final double hourRate) {

        this.name = name;
        this.identifier = identifier;
        this.sex = sex;
        this.hourRate = hourRate;
    }

    final public void setWorkingHoursDay(int workingHoursDay) {
        this.workingHoursDay = workingHoursDay;
    }

    final public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    final public double calculateSalary() {
        salary = salaryCoefficient * workingHoursDay * hourRate;
        return salary;
    }

    final public void printSalary() {
        System.out.println("Name: " + name + " ID: "
                            + identifier + " Salary: " + salary);

    }
}
