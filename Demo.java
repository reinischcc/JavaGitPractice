import java.util.Scanner;

public class Demo 
{
    public static void main(String[] args)
    {
        Print printed;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 1 for Print1 or 2 for Print2");
        int input = scan.nextInt();
        scan.close();
        if(input == 1)
        {
            printed = new Print1();
            printed.PrintIt();
        }
        else if(input == 2)
        {
            printed = new Print2();
            printed.PrintIt();
        }
    }

}
