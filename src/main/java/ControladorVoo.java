import java.util.ArrayList;

public class ControladorVoo {

    private ArrayList<Voo> voos = new ArrayList<>();
    private static final int NUMERO_DE_VOOS = 10;

    public ControladorVoo() {
        for (int i = 1; i <= NUMERO_DE_VOOS; i++) {
            Voo jorge = new Voo("A" + i);
            voos.add(jorge);
        }
    }

    public int VerificarStatus(String vooDesejado, int assento) {
        int disponibilidade;
        Voo vooEncontrado;
        Assento assentoDesejado;
        int codigoVooDesejado = (Integer.parseInt(vooDesejado.substring(1)) - 1);
        try {
            vooEncontrado = voos.get(codigoVooDesejado);
        } catch (IndexOutOfBoundsException e) {
            return 3;
        }
        try {
            assentoDesejado = vooEncontrado.procurarAssento(assento);
        } catch (IndexOutOfBoundsException e) {
            return 2;
        }
        boolean disponivel = assentoDesejado.isDisponivel();
        if (disponivel == true) {
            disponibilidade = 0;
        } else {
            disponibilidade = 1;
        }
        return disponibilidade;
    }
}
