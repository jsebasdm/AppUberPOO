import java.util.ArrayList;
import java.util.Map;

//Clase UberBlack (Hereda de la clase Carro)
class UberBlack extends Car {
    // Atributos o propiedades de la clase
    private Integer id;
    private Map<String, ArrayList<String, Integer>> typeCarAccepted;
    private ArrayList<String> seatsMaterial;

    // Método constructor
    public UberBlack(String license, Driver driver, Map<String, ArrayList<String, Integer>> typeCarAccepted,
            ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}