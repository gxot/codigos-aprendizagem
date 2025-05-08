"""
Tipo tupla - Uma lista imutável
"""
nomes = ['Maria', 'Helena', 'Luiz']
nomes = tuple(nomes)
print(nomes[-1])
print(nomes)

for inverso in reversed(nomes):
    print(inverso)