# Importamos las clases
from payment import Payment

# Clase Paypal (Hereda de la clase Pago)
class Paypal(Payment):

    # Atributos o propiedades de la clase
    id = int
    email = str
    
    # Método constructor
    def __init__(self, email):
        super().__init__()
        self.email = email