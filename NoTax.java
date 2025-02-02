public class NoTax implements SalesTaxBehavior { //computes the tax rate for alaska
    @Override
    public double compute(double value) {
        return 0.00;
    }
}
