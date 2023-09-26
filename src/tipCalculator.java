import java.util.Scanner;

public class tipCalculator {
    public static void main(String[]args) {

        //INIT
        Scanner scan = new Scanner(System.in);

        //OUTPUT VARS
        double tipAmt;
        double billInclTip;
        double tipPerPerson;
        double totalPerPerson;

        //HEADING
        System.out.println("_________________");
        System.out.println("| TIP CALCULATOR |");
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
        System.out.println();

        //INPUT
        System.out.println("BILL: ");
        double totalBill = scan.nextDouble();
        System.out.println();

        System.out.println("TIP PERCENT: ");
        int tipPercent = scan.nextInt();
        System.out.println();

        System.out.println("NO. OF PEOPLE IN PARTY: ");
        int pplInParty = scan.nextInt();
        System.out.println();

        System.out.println();

        //CALCULATION
        tipAmt = (totalBill * tipPercent);
        billInclTip = (totalBill + tipAmt);
        tipPerPerson = (tipAmt / pplInParty);
        totalPerPerson = (billInclTip / pplInParty);

        //OUTPUT
        System.out.println("TOTAL TIP AMOUNT: " + tipAmt);
        System.out.println("TOTAL BILL INCL. TIP: " + billInclTip);
        System.out.println("TIP PER PERSON: " + tipPerPerson);
        System.out.println("TOTAL PER PERSON: " + totalPerPerson);
    }
}
