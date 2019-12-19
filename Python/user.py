# Importamos las clases
from account import Account

# Clase Usuario (Hereda de la clase Cuenta)
class User(Account):
    def __init__(self, name, document):
        super().__init__(name, document)
