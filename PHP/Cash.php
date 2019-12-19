<?php
//Importamos las clases
require_once('Payment.php');
//Clase Efectivo (Hereda de la clase Pago)
class Cash extends Payment
{
    //Atributos o propiedades de la clase
    public $id;
}