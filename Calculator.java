public class Calculator {
    public static void main(String[] args) {
        String znak = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        calc(a, b, znak); 
    }

    private static void calc(int a, int b, String znak) {

        switch (znak) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / (double)b);
                break;
            default:
                System.out.println("błędny znak");

        }

    }
}