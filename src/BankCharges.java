import java.util.Scanner;

public class BankCharges {
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);       //Scanner

            final double BASE_FEE = 10.00;              //To hold the monthly base fee
            double serviceFee;                           //To hold the monthly fee

            System.out.print("Enter number of checks written for the month: ");
            int writtenChecks = input.nextInt();
            //Input validation
            while(writtenChecks < 0)
            {
                System.out.println("Number of checks cannot be a decimal or less than zero.\n");
                System.out.print("Enter number of checks again: ");
                writtenChecks = input.nextInt();
            }

            //Determine the service fee
            if(writtenChecks < 20)
                 serviceFee = BASE_FEE + (writtenChecks*0.10);
            else if (writtenChecks < 40)
                serviceFee = BASE_FEE + (writtenChecks*0.08);
            else if (writtenChecks <60)
                    serviceFee = BASE_FEE + (writtenChecks*0.06);
            else
                serviceFee = BASE_FEE + (writtenChecks*0.04);

            System.out.println("Number of checks: "+ writtenChecks);
            System.out.println("Monthly service Fee: $" + serviceFee);
        }
}
