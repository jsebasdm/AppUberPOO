//Clase UberX (Hereda de la clase Carro)
class UberX extends Car {
    // Atributos o propiedades de la clase
    String brand;
    String model;

    // Método constructor
    public UberX(String license, Account driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
}