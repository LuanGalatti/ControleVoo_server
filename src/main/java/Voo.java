
import java.util.ArrayList;

public class Voo {

    private static final int NUMERO_DE_ASSENTOS = 50;
    private String codigoVoo;
    private ArrayList<Assento> assentos = new ArrayList<>();

    public Voo(String codigoVoo) {
        this.codigoVoo = codigoVoo;
        for (int i = 1; i <= NUMERO_DE_ASSENTOS; i++) {
            Assento jorge = new Assento(i);
            assentos.add(jorge);
        }
    }

    public String getCodigoVoo() {
        return codigoVoo;
    }

    public void setCodigoVoo(String codigoVoo) {
        this.codigoVoo = codigoVoo;
    }

    public ArrayList<Assento> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<Assento> assentos) {
        this.assentos = assentos;
    }

    public Assento procurarAssento(int numero) {
        Assento assentoProcurado = assentos.get(numero - 1);
        return assentoProcurado;
    }
}
