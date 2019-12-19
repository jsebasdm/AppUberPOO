//Clase viaje
class Trip {
    // Atributos o propiedades de la clase
    private Integer id;
    public User user;
    public Car car;
    public Route route;
    public Payment payment;
    private double amount;
    private double progress;
    private boolean completed;

    // Método constructor
    public Trip(User user, Car car, Route route, Payment payment) {
        this.user = user;
        this.car = car;
        this.route = route;
        this.payment = payment;
    }

    // Métodos getters y setters
    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}