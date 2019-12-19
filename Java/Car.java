//Clase carro
class Car {
    // Atributos o propiedades de la clase
    private Integer id;
    private String license;
    private Driver driver;
    private Integer passenger;

    // Método constructor
    public Car(String license, Driver driver) {
        this.license = license;
        this.driver = driver;
    }

    // Método para mostrar los datos del carro
    void showDataCar() {
        System.out.println(
                "Driver name: " + driver.name + "\n" + "license: " + license + "\n" + "Passenger: " + passenger);
    }

    // Métodos getters y setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPassenger() {
        return passenger;
    }

    public void setPassenger(Integer passenger) {
        this.passenger = passenger;
    }

}