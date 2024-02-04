public abstract class Employee {
    int patientHealth;
    double salary;
    String employeeName;
    int employeeNumber;

    public Employee(double salary, String employeeName, int employeeNumber) {
        this.patientHealth = 10;
        this.salary = salary;
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
    }

    public int getPatientHealth() {
        return this.patientHealth;
    }

    public void setPatientHealth(int patientHealth) {
        this.patientHealth = patientHealth;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeNumber() {
        return this.employeeNumber;

    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public String toString() {
        String employeeDetails = "The patient's health for this employee is " + this.patientHealth;

        return employeeDetails;
    }

    public abstract double calculatePay();
}