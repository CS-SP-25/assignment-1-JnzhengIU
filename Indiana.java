public class Indiana extends State{
     public Indiana() {
            setName("Indiana");
            setTaxBehavior(new SevenPercent());
        }

        @Override
        public void showTax(double value) {
            super.showTax(value);
        }
    }
