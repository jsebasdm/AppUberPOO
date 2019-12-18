<?php
//Importación de clases
require_once('Account.php');

//Clase carro
class Car
{
    // Atributos o propiedades de la clase
    public $id;
    public $license;
    public $driver;
    public $passenger;

    //Método constructor
    public function __construct($license, $driver)
    {
        $this->license = $license;
        $this->driver = $driver;
    }

    //Método para visualizar los datos del carro
    public function showDataCar()
    {
        echo "License: $this->license, Driver: ".$this->driver->name;
    }
}
