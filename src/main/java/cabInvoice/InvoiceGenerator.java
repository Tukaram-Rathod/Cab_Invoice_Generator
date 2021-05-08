package cabInvoice;

public class InvoiceGenerator {

    private static final double MINIMUM_COST_PER_KM = 10;
    private static final int COST_PER_TIME = 1;

    //  //method to calculate fare and return total fare
    public double calculateFare(double distance, int time) {
        return distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
    }
}
