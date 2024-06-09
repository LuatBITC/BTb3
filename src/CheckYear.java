public class CheckYear {
    
    public void CheckLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Day la nam nhuan");
        } else {
            System.out.println("Day khong phai la nam nhuan");
        }
    }

    public static void main(String[] args) {
        CheckYear checker = new CheckYear();
        
        checker.CheckLeapYear(2020); 
        checker.CheckLeapYear(2021); 
        checker.CheckLeapYear(1900); 
        checker.CheckLeapYear(2000);
    }
}