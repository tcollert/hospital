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

    public void careForPatient() {
        int currentPatientHealth = this.getPatientHealth();
        int updatedPatientHealth = currentPatientHealth + 1;
        this.setPatientHealth(updatedPatientHealth);

        // Shortened version: this.setPatientHealth(this.getPatientHealth() + 1);

    }

    @Override
    public double calculatePay() {
        double pay = this.salary * patientHealth * .5;
        return pay;

    }
}
