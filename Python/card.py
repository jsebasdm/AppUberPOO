# Importamos las clases
from payment import Payment

# Clase Tarjeta (Hereda de la clase Pago)
class Card(Payment):
    
    # Atributos o propiedades de la clase
    id = int
    numberCard = int
    CVV = int
    date = str

    # Método constructor
    def __init__(self, numberCard, CVV, date):
        super().__init__()
        self.numberCard = numberCard
        self.CVV = CVV
        self.date = date
