<?php
//Clase cuenta
class Account
{
    // Atributos o propiedades de la clase
    public $id;
    public $name;
    public $document;
    public $email;
    public $password;

    //Método constructor
    public function __construct($name, $document)
    {
        $this->name = $name;
        $this->document = $document;
    }
}
