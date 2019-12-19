# Importamos las clases
from account import Account

# Clase Conductor (Hereda de la clase Cuenta)
class Driver(Account):
    def __init__(self, name, document):
        super().__init__(name, document)