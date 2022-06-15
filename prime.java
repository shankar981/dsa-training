import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number= sc.nextInt();
        int i;
        for(i=2; i<=Math.sqrt(Number);i++)
        {
            if(Number%i==0)
                break;
        }
        if(i==Math.sqrt(Number))
            System.out.print(Number+" is prime");
        else
            System.out.print(Number+" is not prime");
    }
}
