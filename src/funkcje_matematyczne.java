import java.util.Scanner;

public class funkcje_matematyczne {
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
       int randomNr = (int) (Math.random()*101) +1;

       System.out.println("Zaraz wpiszesz liczbę masz 5 prób by dobrze zgadnąć: ");

       int proba = 1;
       boolean y = (false); 


       while(proba < 6){
            System.out.println("Próba: "+proba+" ,podaj liczbę: ");
            int x = scanner.nextInt();
            if(x > randomNr){
                System.out.println("Podałeś zbyt duża liczbe!");
            }else if(x < randomNr){
                System.out.println("Podałeś zbyt małą liczbę!");
            }else if(x == randomNr){
                y = true;
                break;
            }

            proba++;
       }

       if(y){
           System.out.println("Udało ci się!");
       }else{
           System.out.println("Następnym razem ci się uda!");
       }

       scanner.close();

       //powinno dzialac ale ciezko zgadnac

    }
}
