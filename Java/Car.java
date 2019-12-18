//Clase carro
class Car {
    // Atributos o propiedades de la clase
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    // Método constructor
    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    // Método para mostrar los datos del carro
    void showDataCar() {
        System.out.println("Driver name: " + driver.name + "\n" + "license: " + license);
    }
}