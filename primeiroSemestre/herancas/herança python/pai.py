class Pessoa:
    def __init__(self, nome, sexo, idade):
        self.nome = nome
        self.sexo = sexo
        self.idade = idade
        self.className = self.__class__.__name__

    def informaSituacao(self):
        print(f'{self.className} está presente.')
    
class Funcionario(Pessoa):
    def atender(self):
        print(f'{self.className} está a atender.')

class Cliente(Pessoa):
    def comprar(self):
        print(f'{self.className} está a comprar.')
