// Clase Tarjeta (Hereda de la clase pago)
class Card extends Payment {
    // Atributos o propiedades de la clase
    Integer id;
    Integer cardNumber;
    Integer CVV;
    String date;

    // Método constructor
    public Card(Integer cardNumber, Integer CVV, String date) {
        super();
        this.cardNumber = cardNumber;
        this.CVV = CVV;
        this.date = date;
    }
}