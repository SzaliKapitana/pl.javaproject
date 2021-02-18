import java.util.Scanner;
public class Metody {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Napisz nazwę województwa aby poznać jego stolicę: ");

        System.out.println(wartosc(scanner.nextLine()));
        
        scanner.close();
    }
    static String wartosc( String userWoj ){ 
        
        String[][] woj = {
            {"Śląsk" , "Katowice"},
            {"Wielkopolskie" , "Poznań"},
            {"Małopolskie" , "Kraków"},
            {"Mazowieckie" , "Warszawa"},
            {"Łódzkie" , "Łódź"}
        };
		
       if(userWoj.equals(woj[0][0])){
           String Kat = woj[0][1];
           return ("Stolica tego województwa to: "+Kat);
       }else if(userWoj.equals(woj[1][0])){
            String Poz = woj[1][1];
            return ("Stolica tego województwa to: "+Poz);
       }else if(userWoj.equals(woj[2][0])){
            String Kra = woj[2][1];
            return ("Stolica tego województwa to: "+Kra);
       }else if(userWoj.equals(woj[3][0])){
            String War = woj[3][1];
            return ("Stolica tego województwa to: "+War);
       }else if(userWoj.equals(woj[4][0])){
            String Lod = woj[4][1];
            return ("Stolica tego województwa to: "+Lod);
       }else{
           return "zła stolica";
       }


       

    }


}
