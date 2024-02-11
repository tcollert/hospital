public class EmergencyDispatcher extends Employee {
    boolean canAnswerCall;
    boolean canManageAmbulances;

    public EmergencyDispatcher(double salary, String employeeName, int employeeNumber, boolean canAnswerCall,
            boolean canManageAmbulances) {
        super(salary, employeeName, employeeNumber);
        this.canAnswerCall = canAnswerCall;
        this.canManageAmbulances = canManageAmbulances;
    }

    public boolean getCanAnswerCall() {
        return canAnswerCall;
    }

    public void setCanAnswerCall(boolean canAnswerCall) {
        this.canAnswerCall = canAnswerCall;
    }

    public boolean getCanManageAmbulances() {
        return canManageAmbulances;
    }

    public void setCanManageAmbulances(boolean canManageAmbulances) {
        this.canManageAmbulances = canManageAmbulances;
    }

    @Override
    public double calculatePay() {
        double pay = this.salary + (this.salary * patientHealth * .3);

        return pay;
    }
}
