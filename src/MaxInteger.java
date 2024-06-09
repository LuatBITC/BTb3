import java.util.Scanner;

public class MaxInteger {
    
    public void FindMaxInteger() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so thu nhat: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Nhap so thu hai: ");
        int number2 = scanner.nextInt();
        
        System.out.print("Nhap so thu ba: ");
        int number3 = scanner.nextInt();
        
        int max = number1;
        
        if (number2 > max) {
            max = number2;
        }
        
        if (number3 > max) {
            max = number3;
        }
        
        System.out.println("So lon nhat la: " + max);
    }

    public static void main(String[] args) {
        MaxInteger maxInteger = new MaxInteger();
        maxInteger.FindMaxInteger();
    }
}
