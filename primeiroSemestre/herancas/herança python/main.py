from pai import *

p1 = Pessoa('Lucas', 'Masculino', 25)
f1 = Funcionario('João', 'Masculino', 23)
c1 = Cliente('Joana', 'Feminino', 27)


p1.informaSituacao() 
f1.atender()
c1.comprar()

# c1.atender() método apenas para Funcionário
# f1.comprar() método apenas para Cliente