public class CashTransaction extends Payment {

    private double cashTendered;

    @Override
    public boolean makeTransaction() {
        System.out.println("Processing cash payment...");
        return true;
    }

}