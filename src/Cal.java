import java.util.Scanner;
public class Cal {
    public static void main(String[] args) throws Exception{



        // Dane użytkownika
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();

        System.out.println("Podaj operator + , - , * lub /: ");
        scanner.nextLine();
        String operator = scanner.nextLine();

        System.out.println("Podaj drugą liczbę: ");
        int b = scanner.nextInt();

        //Switch
        switch(operator){
            
            case "+":
            System.out.println("Wynik to: " +(a+b));
            break;

            case "-":
            System.out.println("Wynik to: " +(a-b));
            break;

            case "*":
            System.out.println("Wynik to: " +(a*b));
            break;

            case "/":
            System.out.println("Wynik to "+(a/b)+" i reszty "+(a%b));
            break;

            default:
            System.out.println("Podałeś zły znak");
            break;

        }
            
        scanner.close();



    }
}