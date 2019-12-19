class Main {
    public static void main(String[] args) {
        UberX uberX = new UberX("AMD123", new Driver("Sebas", "12345JSD"), "Alfa Romeo", "147");
        System.out.println("UBERX:" + "\n" + "Brand: " + uberX.brand + "\n" + "Model: " + uberX.model);
        uberX.showDataCar();
        UberPool uberPool = new UberPool("ABC123", new Driver("Alejo", "98765ABC"), "Audi", "Q7");
        uberPool.passenger = 3;
        System.out.println("UBERPOOL:" + "\n" + "Passengers: " + uberPool.passenger);
        uberPool.showDataCar();
    }
}