# Importamos las clases
from account import Account

# Clase carro
class Car:

    # Atributos o propiedades de la clase
    id = int
    license = str
    driver = Account("", "")
    passenger = str

    # Método constructor
    def __init__(self, license, driver):
        self.license = license
        self.driver = driver