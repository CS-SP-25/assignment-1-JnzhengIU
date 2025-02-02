public class SalesTaxCalculator {

    public static void main(String[] args) {
        if (args.length != 2) { //Stops the user and asks for valid arguments
            System.out.println("Please enter 2 valid arguments");
        }
        //converts the string sale amount into a usable double
        double Sale = Double.parseDouble(args[1]);

        State state;
        if (args[0].equalsIgnoreCase("Alaska")) {
            state = new Alaska(); //If the user enters any form of "Alaska", goes to the Alaska class which then goes to state
        } else if (args[0].equalsIgnoreCase("Indiana")) {
            state = new Indiana(); //If the user enters any form of "Indiana", goes to the Indiana class which then goes to state
        } else if (args[0].equalsIgnoreCase("Hawaii")) {
            state = new Hawaii(); //If the user enters any form of "Indiana", goes to the Indiana class which then goes
        } else {
            System.out.println("Please enter a valid state name"); //gives the user an error message if they do not enter either
            return;
        }

        state.showTax(Sale); //calls state which prints everything
    }
}