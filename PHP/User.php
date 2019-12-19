<?php
//Importamos las clases
require_once('Account.php');
//Clase Usuario (Hereda de la clase cuenta)
class User extends Account
{
    //Método constructor
    public function __construct($name, $document)
    {
        parent::__construct($name, $document);
    }
}
