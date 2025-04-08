package calidad.ejemplo1.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Area_CirculoTest {


@Test
    public  void radioPositivo(){
    Area_Circulo areaCirculo= new Area_Circulo();
    int valor_actual= 5;
    double valor_esperado=78.5;
    assertEquals(valor_esperado,areaCirculo.calcularAera(valor_actual));

}

    @Test
    public  void radioCero(){
        Area_Circulo areaCirculo= new Area_Circulo();
        int valor_actual= 0;
        double valor_esperado=0.0;
        assertEquals(valor_esperado,areaCirculo.calcularAera(valor_actual));

    }

    @Test
    public  void radioNegativo(){
        Area_Circulo areaCirculo= new Area_Circulo();
        int valor_actual= -3;

        new AssertionError(areaCirculo.calcularAera(valor_actual));

    }

    @Test
    public  void radioGrande(){
        Area_Circulo areaCirculo= new Area_Circulo();
        int valor_actual= 1000;
        double valor_esperado=3140000.0;
        assertEquals(valor_esperado,areaCirculo.calcularAera(valor_actual));

    }

    @Test
    public  void radioDecimal(){
        Area_Circulo areaCirculo= new Area_Circulo();
        double valor_actual= 3.5;
        double valor_esperado=38.465;
        assertEquals(valor_esperado,areaCirculo.calcularAera(valor_actual));

    }


}
