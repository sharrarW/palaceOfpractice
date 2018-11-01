import java.util.Scanner;

public class TaxClient{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print(
    "(0-single filer, 1-married jointly or qualifying widow(er), "
    + "\n2-married separately, 3-head of household)\n" +
    "Enter the filing status: ");
    int status = sc.nextInt();

    System.out.print("Enter your income: ");
    double income = sc.nextDouble();

    Tax tax1 = new Tax(status,income);
    System.out.println("Your tax is " + (tax1.getTax() * 100)/100.0);
}
