class Main {
    public static void main(String[] args) {
        Car car = new Car("AMD123", new Account("Sebas", "12345JSD"));
        car.passenger = 6;
        car.showDataCar();
    }
}