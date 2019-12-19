//Clase UberX (Hereda de la clase Carro)
class UberX extends Car {
    // Atributos o propiedades de la clase
    private Integer id;
    private String brand;
    private String model;

    // Método constructor
    public UberX(String license, Driver driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    // Metodo para visualizar los datos del carro
    @Override
    void showDataCar() {
        if (getPassenger() == null || getPassenger() != 4) {
            System.out.println("UberX: El número de pasajeros ingresado es incorrecto");
        } else {
            super.showDataCar();
            System.out.println("Brand: " + brand + "\n" + "Model: " + model);
        }
    }
}