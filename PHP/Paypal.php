
<?php
//Importamos las clases
require_once('Payment.php');
//Clase Paypal (Hereda de la clase Pago)
class Paypal extends Payment
{
    //Atributos o propiedades de la clase
    public $id;
    public $email;

    //Método constructor
    public function __construct($email)
    {
        $this->email = $email;
    }
}
