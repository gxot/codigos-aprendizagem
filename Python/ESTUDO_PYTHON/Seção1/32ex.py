"""
Faça um programa que peça ao usuário para digitar um número inteiro,
informe se este número é par ou ímpar. Caso o usuário não digite um número
inteiro, informe que não é um número inteiro.
"""
# numero = input('Digite um número inteiro:')

# if numero.isdigit():
#     if int(numero) % 2 == 0:
#         print('Esse número é par')
#     else:
#         print('Esse número é ímpar')
# else:
#     print('Este não é um número inteiro')
    
"""
Faça um programa que pergunte a hora ao usuário e, baseando-se no horário 
descrito, exiba a saudação apropriada. Ex. 
Bom dia 0-11, Boa tarde 12-17 e Boa noite 18-23.
"""
# entrada = input('Digite a hora em números inteiros: ')

# try:
#     hora = int(entrada)
#     if  hora <= 11:
#         print('Bom dia')
#     elif hora <= 17:
#         print('Boa tarde')
#     elif hora <= 23:
#         print('Boa noite')
#     else:
#         print('Como é possível vc ser tão burro?')
# except:
#     print('Digita só número inteiro burrão')

"""
Faça um programa que peça o primeiro nome do usuário. Se o nome tiver 4 letras ou 
menos escreva "Seu nome é curto"; se tiver entre 5 e 6 letras, escreva 
"Seu nome é normal"; maior que 6 escreva "Seu nome é muito grande". 
"""
entrada = input('Digite APENAS seu primeiro nome: ')
nome = len(entrada)

if nome > 1:
    if nome <= 4:
        print('Seu nome é curto')
    elif nome <= 6:
        print('Seu nome é normal')
    else:
        print('Seu nome é grande e provavelmente muito feio')
else:
    print('Você é muito burro')


