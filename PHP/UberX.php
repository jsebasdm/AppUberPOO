<?php
require_once('Car.php');
//Clase UberX (Hereda de la clase Carro)
class UberX extends Car
{
    // Atributos o propiedades de la clase
    public $brand;
    public $model;

    // Método constructor
    public function __construct($license, $driver, $brand, $model)
    {
        parent::__construct($license, $driver);
        $this->brand = $brand;
        $this->model = $model;
    }
}
