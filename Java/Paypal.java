// Clase Paypal (Hereda de la clase pago)
class Paypal extends Payment {
    // Atributos o propiedades de la clase
    Integer id;
    String email;

    // Método constructor
    public Paypal(String email) {
        super();
        this.email = email;
    }
}