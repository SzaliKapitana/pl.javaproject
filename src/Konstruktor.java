import java.util.jar.Attributes.Name;

public class Konstruktor {
    public static void main(String[] args) throws Exception{

        KonstruktorV2 KonObj = new KonstruktorV2();

        System.out.println(KonObj.name+" to "+KonObj.race+" , który ma "+KonObj.age+" lat");

    }
}
