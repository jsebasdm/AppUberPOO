<?php
require_once('Car.php');
//Clase UberVan (Hereda de la clase Carro)
class UberVan extends Car
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