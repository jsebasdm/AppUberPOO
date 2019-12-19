//Clase UberPool (Hereda de la clase Carro)
class UberPool extends Car {
    // Atributos o propiedades de la clase
    private Integer id;
    private String brand;
    private String model;

    // Método constructor
    public UberPool(String license, Driver driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    // Metodo para mostrar los datos del carro
    @Override
    void showDataCar() {
        if (getPassenger() == null || getPassenger() != 4) {
            System.out.println("UberPool: El número de pasajeros ingresado es incorrecto");
        } else {
            super.showDataCar();
            System.out.println("Brand: " + brand + "\n" + "Model: " + model);
        }
    }
}