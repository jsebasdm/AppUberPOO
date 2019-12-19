#Importamos las clases
from payment import Payment
#Clase Efectivo (Hereda de la clase Pago)
class Cash(Payment):
    #Atributos o propiedades de la clase
    id = int