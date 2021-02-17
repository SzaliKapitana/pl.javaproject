import java.util.Scanner;
public class tablice {
    public static void main(String[] args) throws Exception {  
        Scanner scanner = new Scanner(System.in);
        
        String[][] dane = {
          {"Więcej niż jedno zwierzę","stado","klucz","dwa","owca","lama"},
          {"Sporty na s","sztafeta","skok o tyczce", "skoki narciarskie", "sumo", "szachy"}
        };
    
        
        int wynik = 0;
    
        
        for(int i = 0; i < dane.length; i++){
          System.out.println(dane[i][0]); 
          String odp = scanner.nextLine(); 
          boolean isAnswerCorrect = false;
          
          for(int it = 1; it < dane[i].length; it++){
            
            if(dane[i][it].equals(odp)){
              isAnswerCorrect = true;
              System.out.println( "BRZDĘK" );
              wynik += it*10;
            }
          }
          if(!isAnswerCorrect){
            System.out.println("X");
          }
        }      
        
        System.out.println("Twój wynik to "+wynik);
        scanner.close();
      }
    }
    

