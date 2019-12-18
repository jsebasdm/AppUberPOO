# Importamos las clases
from car import Car

# Clase UberPool (Herencia de la clase carro)
class UberPool (Car):

    # Atributos o propiedades de la clase
    brand = str
    model = str

    # Método constructor
    def __init__(self, license, driver, brand, model):
        super().__init__(license, driver)
        self.brand=brand
        self.model=model
