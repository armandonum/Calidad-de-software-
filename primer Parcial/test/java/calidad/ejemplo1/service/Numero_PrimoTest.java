package calidad.ejemplo1.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Numero_PrimoTest {

    @Test
    public  void numeroPrimo(){
        Numero_Primo primo= new Numero_Primo();
        double valor_esperado = 7;
        assertTrue(primo.calcularPrimo(valor_esperado));
    }
    @Test
    public  void numeroPrimo_V2(){
        Numero_Primo primo= new Numero_Primo();
        double valor_esperado = 7;
        assertTrue(primo.calcularPrimo(valor_esperado));
    }

    @Test
    public  void NOnumeroPrimo(){
        Numero_Primo primo= new Numero_Primo();
        double valor_esperado = 6;
        assertTrue(primo.calcularPrimo(valor_esperado));
    }
    @Test
    public  void NOnumeroPrimo_V2(){
        Numero_Primo primo= new Numero_Primo();
        double valor_esperado = 6;
        assertFalse(primo.calcularPrimo(valor_esperado));
    }

    @Test
    public  void numeroNegativo(){
        Numero_Primo primo= new Numero_Primo();
        double valor_esperado =-3;
        assertFalse(primo.calcularPrimo(valor_esperado));
    }


    @Test
    public  void numeroGradnde(){
        Numero_Primo primo= new Numero_Primo();
        double valor_esperado =997;
        assertFalse(primo.calcularPrimo(valor_esperado));
    }


    @Test
    public  void numeroGrande(){
        Numero_Primo primo= new Numero_Primo();
        double valor_esperado =997;
        assertTrue(primo.calcularPrimo(valor_esperado));
    }


    @Test
    public  void numerCero(){
        Numero_Primo primo= new Numero_Primo();
        double valor_esperado =997;
        assertTrue(primo.calcularPrimo(valor_esperado));
    }


}
