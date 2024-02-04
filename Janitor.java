public class Janitor extends Employee {
    boolean isSweeping;

    public Janitor(double salary, String employeeName, int employeeNumber, boolean isSweeping) {
        super(salary, employeeName, employeeNumber);
        this.isSweeping = isSweeping;
    }

    public boolean getIsSweeping() {
        return this.isSweeping;
    }

    public void setIsSweeping(boolean isSweeping) {
        this.isSweeping = isSweeping;
    }

    @Override
    public double calculatePay() {
        double pay = this.salary + (this.salary * patientHealth * .1);

        return pay;
    }
}