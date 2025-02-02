public class SevenPercent implements SalesTaxBehavior {  //computes Indiana's tax
    @Override
        public double compute(double value) {
            return value * 0.07;
        }
    }
