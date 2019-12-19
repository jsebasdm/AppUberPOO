// Clase Tarjeta (Hereda de la clase Pago)
class Card extends Payment {
    //Método constructor
    constructor(cardNumber, CVV, date) {
        super()
        //Atributos o propiedades de la clase
        this.cardNumber = cardNumber;
        this.CVV = CVV;
        this.date = date;
        this.id
    }
}