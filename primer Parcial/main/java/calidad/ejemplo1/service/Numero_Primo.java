package calidad.ejemplo1.service;

public class Numero_Primo {
    private boolean esPrimo = true;

    public boolean calcularPrimo(double numero) {

        if (numero < 2) {
            this.esPrimo = false;
            return this.esPrimo;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    this.esPrimo = false;
                    return this.esPrimo;
                }
            }
            return this.esPrimo;
        }

    }
}
