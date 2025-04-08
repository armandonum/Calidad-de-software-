package calidad.ejemplo1.service;

public class Area_Circulo {

    public double area_total ;

//    public Area_Circulo(float area_total) {
//        this.area_total = 0;
//    }

    public  double calcularAera (double radio)
    {
        if(radio < 0)
        {
            System.out.println(" error el radio no puede ser negativo ");
        }
        else
        {
        this.area_total= (3.14 * Math.pow(radio,2));
        }

        return this.area_total;
    }
}


/*
<?php
class AreaCirculo{
    private $area_total = 0.0;
    public function CalcularArea($r){

        if ($r < 0) {
            throw new InvalidArgumentException("El radio no puede ser negativo");
        } else{
            $this->area_total = pi() * pow($r, 2);
        }

        return $this->area_total;
    }
}

?>
 */
