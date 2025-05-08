nome = 'Gustavo Henrique Schott'
altura = 1.81
peso = 84

imc = peso / altura ** 2

# F-String
linha1 = f'{nome} tem {altura:.2f}m de altura'
linha2 = f'pesa {peso}kg e seu IMC é:'
linha3 = f'{imc:.2f}'

print(linha1)
print(linha2)
print(linha3)