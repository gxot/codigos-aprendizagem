# Faça uma lista de compras com listas
# O usuário deve ter a possibilidade de
# inserir, apagar e listar valores da sua lista
# Não permita que o programa quebre com
# erros de indices inexistentes na lsita.

import os
lista = []

while True:
    
    escolha = input('Selecione uma opção\n'
      '[i]nserir, [a]pagar, [l]istar: '
     ).lower()

    if escolha == 'i':
        os.system('cls')
        valor = input('Digite o que deseja inserir: ')
        lista.append(valor)
        print('Valor inserido com sucesso.\n')
        continue

    elif escolha == 'a':
        try:
            os.system('cls')
            apaga = int(input('Digite o indice que deseja apagar: '))
            del lista[apaga]
            print('Item apagado com sucesso\n')
        except:
            print('Valor inválido\n')

    elif escolha == 'l':
        os.system('cls')
        for indice, produto in enumerate(lista):
            print(f'{indice} {produto}')
            continue
        print('\n')
        
    else:
        print('Digite uma opção válida\n')
        continue
    



