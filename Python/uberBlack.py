# Importamos las clases
from car import Car

# Clase UberBlack (Herencia de la clase carro)
class UberBlack (Car):

    # Atributos o propiedades de la clase
    typeAcceptedCar = []
    seatsMaterial = []

    # Método constructor
    def __init__(self, license, driver, typeAcceptedCar, seatsMaterial):
        super().__init__(license, driver)
        self.typeAcceptedCar=typeAcceptedCar
        self.seatsMaterial=seatsMaterial
