import java.util.Scanner;

public class Fibonacci {
        public static void main(String[] args)
        {
            int n1=0,n2=1,n3,i;
            Scanner sc = new Scanner(System.in);

            System.out.println("For how many numbers do you want the Fibonacci Series: ");
            int count = sc.nextInt();


            System.out.print(n1+" "+n2);

            for(i=2;i<count;++i)
            {
                n3=n1+n2;
                System.out.print(" "+n3);
                n1=n2;
                n2=n3;
            }

        }
}
