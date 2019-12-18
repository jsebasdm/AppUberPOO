//Clase carro
class Car {
    //Método constructor
    constructor(license, driver) {
        // Atributos o propiedades de la clase
        this.id;
        this.license = license;
        this.driver = driver;
        this.passenger;
    }
    //Método para mostrar los datos del carro
    showDataCar() {
        console.log(this.driver)
        console.log("Driver name: " + this.driver.name)
        console.log("Driver document: " + this.driver.document)
        console.log("Car license: " + this.license)
    }
}