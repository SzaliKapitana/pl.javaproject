import java.util.Scanner;
public class tablice {
    public static void main(String[] args) throws Exception{
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Więcej niż jedno zwierzę to: ");
        String odp = scanner.nextLine();

        String[][] dane = {
            {"stado","klucz","dwa","owca","lama"},
            {"sztafeta","skok o tyczce", "skoki narciarskie", "sumo", "szachy"}
        };


        if(odp.equals(dane[0][0])){
            System.out.println("BRZDĘK");
            }
            else if(odp.equals(dane[0][1])){
                System.out.println("BRZDĘK");
            }
            else if(odp.equals(dane[0][2])){
                System.out.println("BRZDĘK");
            }
            else if(odp.equals(dane[0][3])){
                System.out.println("BRZDĘK");
             }
            else if(odp.equals(dane[0][4])){
                System.out.println("BRZDĘK");
            }
            else{
                System.out.println("X");
        }

        System.out.println("Sport na literę S: ");
        String odpS = scanner.nextLine();

        if(odpS.equals(dane[1][0])){
            System.out.println("BRZDĘK");
            }
            else if(odpS.equals(dane[1][1])){
                System.out.println("BRZDĘK");
            }
            else if(odpS.equals(dane[1][2])){
                System.out.println("BRZDĘK");
            }
            else if(odpS.equals(dane[1][3])){
                System.out.println("BRZDĘK");
             }
            else if(odpS.equals(dane[1][4])){
                System.out.println("BRZDĘK");
            }
            else{
                System.out.println("X");
        }

        /*for(int i = 0; i < dane.length; i++){
            System.out.println(dane[i][0]); 
            for(int it = 0; it < dane[i].length; it++){
                System.out.println("ODP: "+dane[i][it]);
            }
        }*/


        scanner.close();


    }
    
}
