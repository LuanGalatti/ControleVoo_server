
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class ServidorSocket {

    private ControladorVoo controlador = new ControladorVoo();

    public int calcularCodigoStatus(String codigo) {
        int resultado = 5;
        String[] codigoVetor = codigo.split(";");
        if (codigoVetor[0].equals("C")) {
            resultado = controlador.verificarStatus(codigoVetor[1], Integer.parseInt(codigoVetor[2]));
        } else if (codigoVetor[0].equals("M")) {
            resultado = controlador.marcarVoo(codigoVetor[1], Integer.parseInt(codigoVetor[2]));
        }
        return resultado;
    }

    public void rodarServidor() {
        try {
            ServerSocket servidor = new ServerSocket(4444);
            System.out.println("Aguardando cliente!");
            Socket socket = servidor.accept(); // espera
            System.out.println("Chegou o cliente :" + socket.getInetAddress().getHostAddress());
            PrintWriter out =  new PrintWriter(socket.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String mensagem = in.readLine();
            int resultado = calcularCodigoStatus(mensagem);
            out.println(mensagem);
        } catch (IOException e) {
            System.err.println("Problemas de IO");
        }
    }
}
