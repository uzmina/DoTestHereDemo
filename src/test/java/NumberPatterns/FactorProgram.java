package NumberPatterns;

import java.util.Scanner;

public class FactorProgram {

    public static void main(String[] args) {

            Scanner sc =new Scanner(System.in);
            int count=0;
            System.out.println("enter a number");
            int n= sc.nextInt( );
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                    count++;
            }
            if(count==2)
                System.out.println("Yes");
            else
                System.out.println("No this is not a prime number");
        }
    }

