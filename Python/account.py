# Clase cuenta
class Account:

    # Atributos o propiedades de la clase
    id = int
    name = str
    document = str
    email = str
    password = str

    # Método constructor
    def __init__(self, name, document):
        self.name = name
        self.document = document
