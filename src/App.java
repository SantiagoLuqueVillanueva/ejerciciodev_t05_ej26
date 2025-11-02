public class App {
    public static void main(String[] args) throws Exception {
        int numeroIntroducido = Integer.parseInt(System.console().readLine("Introduzca un número entero: "));
        int digito = Integer.parseInt(System.console().readLine("Introduzca un digito: "));

        long numero = numeroIntroducido;
        numero = numero * 10 + 1;
        long volteado = 0;
        int longitud = 0;
        int posicion = 1;

        if (numero == 0) {
            longitud = 1;
        }

        while (numero > 0) {
            volteado = (volteado * 10) + (numero %10);
            numero /= 10;
            longitud++;
        }

        while (volteado != 1) {
            if ((volteado % 10) == digito) {
                System.out.print(posicion + " ");
            }

            volteado /= 10;
            posicion++;
        }
        
        System.out.println();
    }
}
