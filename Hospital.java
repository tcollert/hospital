public class Hospital {
    public static void main(String[] args) {
        Doctor mcDreamy = new Doctor(90000.00, "Derek Shepherd", 1, "Neurology");

        Janitor mcCleany = new Janitor(40000.00, "Glen Matthews", 2, true);

        EmergencyDispatcher lebronJames = new EmergencyDispatcher(40000.00, "Lebron James", 3, true, true);

        Nurse boop = new Nurse(85000.00, "Betty Boop", 4, 8);

        Receptionist mars = new Receptionist(70000.00, "Veronica Mars", 5, true);

        Surgeon mcDonald = new Surgeon(120000.00, "Ronald McDonald", 6, "Burger Doc", true);

        System.out.println(mcDreamy);
        System.out.println(mcCleany);
        System.out.println(lebronJames);
        System.out.println(boop);
        System.out.println(mars);
        System.out.println(mcDonald);

        mcDreamy.careForPatient();
        int mcDreamyPatientHealth = mcDreamy.getPatientHealth();
        System.out.println(mcDreamyPatientHealth);

        boop.careForPatient();
        int boopPatientHealth = boop.getPatientHealth();
        System.out.println(boopPatientHealth);

        mcDonald.careForPatient();
        int mcDonaldPatientHealth = mcDonald.getPatientHealth();
        System.out.println("Doc McDonald's new patient health is: " + mcDonaldPatientHealth);

        double mcDreamyFinalPay = mcDreamy.calculatePay();
        System.out.println("Doc McDreamy's final pay $ " + mcDreamyFinalPay);

        double mcCleanyFinalPay = mcCleany.calculatePay();
        System.out.println("McCleany's final pay $ " + mcCleanyFinalPay);

        double lebronJamesFinalPay = lebronJames.calculatePay();
        System.out.println("Lebron James' final pay $ " + lebronJamesFinalPay);

        double boopFinalPay = boop.calculatePay();
        System.out.println("Nurse Boop's final pay $ " + boopFinalPay);

        double marsFinalPay = mars.calculatePay();
        System.out.println("Veronica Mars' final pay $ " + marsFinalPay);

        double mcDonladFinalPay = mcDonald.calculatePay();
        System.out.println("Doc McDonlad's final pay $ " + mcDonladFinalPay);
    }

}
