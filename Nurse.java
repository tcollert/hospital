public class Nurse extends Employee {
    int numberOfPatients;

    public Nurse(double salary, String employeeName, int employeeNumber, int numberOfPatients) {
        super(salary, employeeName, employeeNumber);
        this.numberOfPatients = numberOfPatients;
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    public void setNumberOfPatients(int numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }

    public void careForPatient() {
        int currentPatientHealth = this.getPatientHealth();
        int updatedPatientHealth = currentPatientHealth + 1;
        this.setPatientHealth(updatedPatientHealth);
    }

    @Override
    public double calculatePay() {
        double pay = this.salary + (this.salary * patientHealth * .2);

        return pay;
    }
}
