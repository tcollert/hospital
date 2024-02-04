public class Doctor extends Employee {
    String specialtyArea;

    public Doctor(double salary, String employeeName, int employeeNumber, String specialtyArea) {
        super(salary, employeeName, employeeNumber);
        this.specialtyArea = specialtyArea;
    }

    public String getSpecialtyArea() {
        return specialtyArea;
    }

    public void setSpecialtyArea(String specialtyArea) {
        this.specialtyArea = specialtyArea;
    }

    @Override
    public double calculatePay() {
        double pay = this.salary * patientHealth * .5;
        return pay;

    }
}
