public abstract class Employee {
    int patientHealth;

    public Employee() {
        this.patientHealth = 10;
    }

    public int getPatientHealth() {
        return this.patientHealth;
    }

    public void setPatientHealth(int patientHealth) {
        this.patientHealth = patientHealth;
    }

    @Override
    public String toString() {
        String employeeDetails = "The Patient's health for this employee is " + patientHealth;

        return employeeDetails;
    }

    public abstract double calculatePay();
}