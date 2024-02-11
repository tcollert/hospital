public class Receptionist extends Employee {
    boolean isOnPhone;

    public Receptionist(double salary, String employeeName, int employeeNumber, boolean isOnPhone) {
        super(salary, employeeName, employeeNumber);
        this.isOnPhone = isOnPhone;
    }

    public boolean getIsOnPhone() {
        return isOnPhone;
    }

    public void setIsOnPhone(boolean isOnPhone) {
        this.isOnPhone = isOnPhone;
    }

    @Override
    public double calculatePay() {
        double pay = this.salary + (this.salary * patientHealth * .30);

        return pay;
    }
}
