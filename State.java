public class State {
    // the "meat" and is what prints the actual output
     private String name;
        private SalesTaxBehavior taxBehavior;

        public void setName(String name) { //setter for name
            this.name = name;
        }

        public void showTax(double value) {
            double tax = taxBehavior.compute(value); //computes the tax and calls
            System.out.printf("The sales tax on $%.2f in %s is $%.2f\n", value, name, tax); //prints with correct format specifiers and cuts off at two decimal places
        }

        void setTaxBehavior(SalesTaxBehavior taxBehavior) {
            this.taxBehavior = taxBehavior;
        }
    }

