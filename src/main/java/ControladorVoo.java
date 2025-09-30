import java.util.List;

public class ControladorVoo {
private List<Voo> voos;  
private static final int NUMERO_DE_VOOS = 10;

    public ControladorVoo() {
               for(int i= 0;i<=NUMERO_DE_VOOS;i++){
            Voo jorge = new Voo("A"+i);
            voos.add(jorge);
        }
    }


}
