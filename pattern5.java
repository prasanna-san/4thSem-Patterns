import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n-1; i++){
            System.out.println("* ");
        }

        for(int i=0;i<n; i++){
            System.out.print("* ");
        }

    }
}
