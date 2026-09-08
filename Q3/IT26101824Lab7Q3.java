import java.util.Scanner;
public class IT26101824Lab7Q3
{
    public static void main(String[] args) {
	
		int customer;
		double amountToPay,discount,bill;
		char payment;

        Scanner input = new Scanner(System.in);

        customer = 1;
		discount = 0;


        while (customer <= 5) {

            System.out.println("Customer " + customer);

            System.out.print("Enter total bill amount: ");
            bill = input.nextDouble();

            System.out.print("Enter payment mode (C for cash,O for other): ");
            payment = input.next().charAt(0);



            if (payment == 'C' || payment == 'c') {

                discount = bill * 5 / 100;
                amountToPay = bill - discount;

                System.out.println("Discount is: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);

            } 
            else if (payment == 'O' || payment == 'o') {

                amountToPay = bill;

                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + amountToPay);

            } 
            else {

                System.out.println("Payment Mode is Not Valid");
            }

            customer++;
            System.out.println();
        }

        input.close();
    }
}