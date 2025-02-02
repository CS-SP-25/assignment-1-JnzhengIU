public class Hawaii extends State {
    public Hawaii(){
        setName("Hawaii");
        setTaxBehavior(new FourFivePercent());
    }

    @Override
    public void showTax(double value) {
        super.showTax(value);
    }
}