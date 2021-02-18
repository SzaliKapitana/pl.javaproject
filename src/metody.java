import java.util.Scanner;
public class Metody {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Napisz nazwę województwa aby poznać jego stolicę: ");

        System.out.println(wartosc(scanner.nextLine()));
        
        scanner.close();
    }
    static String wartosc( String userWoj ){ 

        boolean y = false;
        
        String[][] woj = {
            {"Śląsk" , "Katowice"},
            {"Wielkopolskie" , "Poznań"},
            {"Małopolskie" , "Kraków"},
            {"Mazowieckie" , "Warszawa"},
            {"Łódzkie" , "Łódź"},
            {"Dolnośląskie" , "Wrocław"},
            {"Kujawsko Pomorskie" , "Bydgoszcz i Toruń"},
            {"Lubelskie" , "Lublin"},
            {"Opolskie" , "Opole"},
            {"Podkarpackie" , "Rzeszów"},
            {"Podlaskie" , "Białystok"},
            {"Pomorskie" , "Gdańsk"},
            {"Świętokrzyskie" , "Kielce"},
            {"Warmińsko Mazurskie" , "Olsztyn"},
            {"Zachodniopomorskie" , "Szczecin"}

        };
		
        int x = 0;
        
        
        while (x < woj.length){
            if(userWoj.equals(woj[x][0])){
                y = true;
                break;
            }
            x++;
            
        }

        if(y){
            return "Stolicą tego Województwa jest miasto: " +woj[x][1];
        }else{
            return "Złe Województwo";
        }

        


       

    }


}
