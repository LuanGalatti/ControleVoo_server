import java.util.List;

public class Voo {
    private static final int NUMERO_DE_VOOS = 50;
    private String codigoVoo;
    private List<Assento> assentos;

    public Voo(String codigoVoo) {
        this.codigoVoo = codigoVoo;
        for(int i= 1;i<=NUMERO_DE_VOOS;i++){
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

    public List<Assento> getAssentos() {
        return assentos;
    }

    public void setAssentos(List<Assento> assentos) {
        this.assentos = assentos;
    }
    public Assento procurarAssento(int numero){
        Assento assentoProcurado = assentos.get(numero);
        return assentoProcurado;
    }       
}
