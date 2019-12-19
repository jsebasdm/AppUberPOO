class Main {
    public static void main(String[] args) {
        //
        UberX uberX = new UberX("AMD123", new Driver("Sebas", "12345JSD"), "Alfa Romeo", "147");
        uberX.setPassenger(4);
        uberX.showDataCar();
        //
        UberPool uberPool = new UberPool("ABC123", new Driver("Alejo", "98765ABC"), "Audi", "Q7");
        uberPool.showDataCar();
    }
}