import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=100000)
        {
            for(int i=n;i>=1;i--)
                System.out.println(i);
        }
    }
}