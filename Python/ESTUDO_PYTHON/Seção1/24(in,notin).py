# Operadores in e not in
# Strings são iteráveis
#  0 1 2 3 4 5 6
#  g u s t a v o
# -7-6-5-4-3-2-1 

# nome = 'Gustavo'
# # print(nome[-1])
# print('avo' in nome)
# print('z' in nome)
# print(10 * '-')
# print('x' not in nome)
# print('Gus' not in nome)

nome = input('Digite seu nome: ')
encontrar = input('Digite o que deseja encontrar: ')

if encontrar in nome:
    print(f'{encontrar} está no seu nome')
else:
    print(f'{encontrar} não está no seu nome')