<?php
require_once('Car.php');
//Clase UberBlack (Hereda de la clase Carro)
class UberBlack extends Car
{
    // Atributos o propiedades de la clase
    public $typeCarAccepted;
    public $seatsMaterial;

    // Método constructor
    public function __construct($license, $driver, $typeCarAccepted, $seatsMaterial)
    {
        parent::__construct($license, $driver);
        $this->typeCarAccepted = $typeCarAccepted;
        $this->seatsMaterial = $seatsMaterial;
    }
}
