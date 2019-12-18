// Clase UberPool (Hereda de la clase carro)
class UberPool extends Car {
    // Método constuctor de la clase
    constructor(license, driver, brand, model) {
        super(license, driver)
        // Atributos o propiedades de la clase
        this.brand = brand;
        this.model = model;
    }
}