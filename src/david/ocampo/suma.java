package david.ocampo;

/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
 Es posible que el codigo generado no sea completamente correcto. Si encuentra
 errores por favor reportelos en el foro (http://pseint.sourceforge.net). */
// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "SIN_TITULO.java."
import java.io.*;

public class suma {

    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int a;
        int b;
        int c;
        int d;
        int e;
        System.out.println("ingresa los numeros");
        a = Integer.parseInt(bufEntrada.readLine());
        b = Integer.parseInt(bufEntrada.readLine());
        c = Integer.parseInt(bufEntrada.readLine());
        d = Integer.parseInt(bufEntrada.readLine());
        e = a + b + c + d;
        System.out.println(e);
    }

}
