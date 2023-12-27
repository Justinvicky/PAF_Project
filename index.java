import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        System.out.println("To find Prime Number Press 1");
        System.out.println("To find Armstrong Number Press 2");
        System.out.println("To Print Fibonacci Number Press 3");


        Scanner in = new Scanner(System.in);
        int choice=in.nextInt();

        switch (choice) {
            case 1:
            System.out.print("Enter the Number to find prime or not : ");
              int n = in.nextInt();
             Prime(n);
                
                break;
            case 2:
            System.out.println("To find one number is Armstrong or not press 1 : ");
            System.out.println("To get multiple number is Armstrong press anything : ");
            int num = in.nextInt();
            if (num ==1){
                System.out.print("Enter the Number : ");
              int num1 = in.nextInt();
                Armstrong(num1);

            }else{
                System.out.println("Enter the First number ");
                int num1=in.nextInt();
                System.out.println("Enter the Last number ");
                int num2=in.nextInt();
                
                for (int i = num1; i < num2; i++) {
                    if (isArmstrong(i)) {
                        System.out.print(i + " ");
                    }
                }
                    }                
                        break;
            case 3:{
            fibonacci();
            }
            break;
                
                    default:
                    System.out.println("Enter the Valid input !...");
                        break;
                }        
    }

// ========================================Armstrong Start===================================================

    static void Armstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
if(sum == original){
    System.out.println("It's a Armstrong Number");
}else
System.out.println("It's Not A Armstrong Number!...");
       
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }

        return sum == original;
    }
 // ===========================================0Armstrong End================================================
// ============================================Prime Start===================================================

    static void Prime(int n){
        if(n <= 1) {
            System.out.println("Neither prime nor composite");
            return;
        }
        
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                System.out.println("Not Prime");
                return;
            }
            c = c + 1;
            // c++;
        }
        if (c * c > n) {
            System.out.println("Prime");
        }
    }
// =========================================Prime End===================================================

// =======================================fibonacci Start===================================================
    public static void fibonacci() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number that how much series of number in fibonacci : ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 0;
        System.out.println();


        while (count < n) {
            System.out.print(a+" ");
            int temp = b+a;
            a = b;
            b = temp;
            count++;
            // System.out.println(b);

        }

    }
        // ==============fibonacci End===================================================

}
