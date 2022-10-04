// import java.util.Scanner;
class MonthlyCCBalanceRate{
    public static void main(String args[]) {
        // Scanner in=new Scanner(System.in);
        double balance=5000;
        double rate=0.17/12;//interest rate per month
        System.out.println("Interest due after one month: $"+(balance*rate));
        System.out.println("Interest due after two months: $"+((balance*rate)+(balance+balance*rate)*rate));
    }
}