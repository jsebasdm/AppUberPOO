<?php
//Importamos las clases
require_once('Payment.php');
//Clase Tarjeta (Hereda de la clase Pago)
class Card extends Payment
{
    //Atributos o propiedades de la clase
    public $id;
    public $numberCard;
    public $CVV;
    public $date;

    //Método constructor
    public function __construct($numberCard,$CVV,$date){
        $this->numberCard=$numberCard;
        $this->CVV=$CVV;
        $this->date=$date;
    }
}