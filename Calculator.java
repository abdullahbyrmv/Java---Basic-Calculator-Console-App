import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        calculate();
    }
    public static double calculate() {
        Scanner input = new Scanner(System.in);
        double result;
        System.out.print("Please Enter a : ");
        double a = input.nextDouble();
        System.out.print("Please Enter b : ");
        double b = input.nextDouble();
        System.out.print("Please Enter Operation (1 - Addition , 2 - Deduction, 3 - Multiplication , 4- Division , 5 - Remainder) : ");
        int operation = input.nextInt();
        switch (operation) {
            case 1:
                result = MathUtil.addition(a,b);
                break;
            case 2:
                result = MathUtil.deduction(a,b);
                break;
            case 3:
                result = MathUtil.multiplication(a,b);
                break;
            case 4:
                result = MathUtil.division(a,b);
                break;
            case 5:
                result = MathUtil.remainder(a,b);
                break;
            default:
                result = -1;
        }
        return result;
    }
}
