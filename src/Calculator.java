public class Calculator {
    
    public void CalculatorInteger(String operation, int number1, int number2) {
        switch (operation) {
            case "+":
                System.out.println("Ket qua: " + (number1 + number2));
                break;
            case "-":
                System.out.println("Ket qua: " + (number1 - number2));
                break;
            case "*":
                System.out.println("Ket qua: " + (number1 * number2));
                break;
            case "/":
                if (number2 != 0) {
                    System.out.println("Ket qua: " + (number1 / number2));
                } else {
                    System.out.println("Loi: Khong the chia cho 0");
                }
                break;
            default:
                System.out.println("Phep toan không hop le");
                break;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        calc.CalculatorInteger("+", 10, 5); 
        calc.CalculatorInteger("-", 10, 5);  
        calc.CalculatorInteger("*", 10, 5); 
        calc.CalculatorInteger("/", 10, 5); 
        calc.CalculatorInteger("/", 10, 0); 
        calc.CalculatorInteger("%", 10, 5); 
    }
}