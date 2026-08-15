import java.util.*;

public class calculateBankAmount {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Current Balance in the bank: ");
        int currentBalance = sobj.nextInt();
        System.out.println("Requested Withrawal Amount: ");
        int withdrawalAmount = sobj.nextInt();

        if (withdrawalAmount % 100 != 0) {
            System.out.println("Amount must be a multiple of 100.");
        }else if(currentBalance <0 || withdrawalAmount < 0){
            System.out.println("Invalid input. Balance and withdrawal amount cannot be negative.");
        } else if (currentBalance < withdrawalAmount) {
            System.out.println("Insufficient balance.");
        } else if(withdrawalAmount > 25000){
            System.out.println("Withdrawal amount exceeds the daily limit.");
            System.out.println("Max withdrawal limit is 25000.");
        } else if(currentBalance < 1000){
            System.out.println("Current balance is less than 1000.");
        } else {
            currentBalance -= withdrawalAmount;
            System.out.println("Withdrawal successful. Remaining balance: " + currentBalance);
        }
    }

}
