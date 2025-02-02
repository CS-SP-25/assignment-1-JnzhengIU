public class Alaska extends State {
        public Alaska() {
            setName("Alaska");
            setTaxBehavior(new NoTax());
        }

        @Override
        public void showTax(double value) {
            super.showTax(value);
        }
    }

