<?php
//Importamos las clases
require_once('Account.php');
//Clase Conductor (Hereda de la clase cuenta)
class Driver extends Account
{
    //Método constructor
    public function __construct($name, $document)
    {
        parent::__construct($name, $document);
    }
}
