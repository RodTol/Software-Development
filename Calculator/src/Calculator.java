public class Calculator {

    /*For each operation I assign a code that
    * identify it*/
    static int identify_symbol (String input) {
        switch (input) {
            case "+" : return 1;
            case "-" : return 2;
            case "/" : return 3;
            case "*" : return 4;
            default:
                System.out.println("Symbol not recognised: " + input);
                return 0;
        }
    }

    public static void main(String[] args) {
        /*Default type for addend is double, if they became
        * int I cast into it*/
        double mem1_d = 0.0;
        double mem2_d = 0.0;

        int mem1_int = 0;
        int mem2_int = 0;

        /*First of all I look at how java reads the input*/
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);

        for (int i = 1; i < args.length-1; i++) {
            /*I look for an operation. If I find it I'll compute it
            * otherwise I 'll skip to the next iteration*/
            int symbol = identify_symbol(args[i]);
            if (symbol != 0) {
                System.out.println("Operation code " + symbol);
            } else  {
                continue;
            }

            if (args[i-1].contains(".")) {
                mem1_d = Double.parseDouble(args[i-1]);
            } else {
                mem1_int = Integer.parseInt(args[i-1]);
            }

            if (args[i+1].contains(".")) {
                mem2_d = Double.parseDouble(args[i+1]);
            } else {
                mem2_int = Integer.parseInt(args[i+1]);
            }

            switch (symbol) {
                case 1 : System.out.println(;
                case 2 : System.out.println("Symbol not recognised: " + input);
                case 3 : System.out.println("Symbol not recognised: " + input);
                case 4 : System.out.println("Symbol not recognised: " + input);
                default:
                    System.out.println("Operation failed");
            }

        }

    }


}
