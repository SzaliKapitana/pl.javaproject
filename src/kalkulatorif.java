import java.util.Scanner;
public class kalkulatorif {
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę: ");
        int a = scanner.nextInt();

        System.out.println("Podaj operator + lub -: ");
        String operator = scanner.nextLine();

        System.out.println("Podaj drugą liczbę: ");
        int b = scanner.nextInt();

        if (operator == "-"){
            System.out.println("Wynik to: " +(a-b));
            }
            else if(operator == "+"){
                System.out.println("Wynik to: " +(a+b));
            }
            else{
                System.out.println("Wpisz odpowiedni operator. Spróbój ponownie.")
            }
            
        
        scanner.close();



    }
}