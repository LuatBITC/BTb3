public class Equation {
    
    public void CalculateQuadratic(int a, int b, int c) {
        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh vo nghiem.");
            return;
        }
        
        if (a == 0) {
            System.out.println("Phuong trinh co mot nghiem: " + (-c / (double)b));
            return;
        }
        
        double delta = b * b - 4 * a * c;
        
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem.");
        } else if (delta == 0) {
            double x = -b / (2.0 * a);
            System.out.println("Phuong trinh co nghiem kep: " + x);
        } else {
            double sqrtDelta = Math.sqrt(delta);
            double x1 = (-b + sqrtDelta) / (2 * a);
            double x2 = (-b - sqrtDelta) / (2 * a);
            System.out.println("Phuong trinh co hai nghiem phan biet:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }

    public static void main(String[] args) {
        Equation equation = new Equation();
        
        equation.CalculateQuadratic(1, -3, 2);  
        equation.CalculateQuadratic(1, 2, 1);   
        equation.CalculateQuadratic(1, 2, 3);   
        equation.CalculateQuadratic(0, 2, -4);  
        equation.CalculateQuadratic(0, 0, 1);  
    }
}