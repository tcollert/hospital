public class Surgeon extends Employee {
    String specialtyArea;
    boolean isOperating;

    public Surgeon(double salary, String employeeName, int employeeNumber, String specialtyArea, boolean isOperating) {
        super(salary, employeeName, employeeNumber);
        this.specialtyArea = specialtyArea;
    }

    public String getSpecialtyArea() {
        return specialtyArea;
    }

    public void setSpecialtyArea(String specialtyArea) {
        this.specialtyArea = specialtyArea;
    }

    public boolean getIsOperating() {
        return this.isOperating;
    }

    public void setIsOperating(boolean isOperating) {
        this.isOperating = isOperating;

    }

    public void careForPatient() {
        int currentPatientHealth = this.getPatientHealth();
        int updatedPatientHealth = currentPatientHealth + 1;
        this.setPatientHealth(updatedPatientHealth);
    }

    @Override
    public double calculatePay() {
        double pay = this.salary * patientHealth * .5;
        return pay;

    }
}
