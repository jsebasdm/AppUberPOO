# Importamos las clases
from driver import Driver

# Clase carro
class Car:

    # Atributos o propiedades de la clase
    id = int
    license = str
    driver = Driver("","")
    passenger = str

    # Método constructor
    def __init__(self, license, driver):
        self.license = license
        self.driver = driver