while True:

    pergunta_1 = input('Digite um número: ')
    pergunta_3 = input('Digite um operador (+-*/): ')
    pergunta_2 = input('Digite outro número: ')

    numeros_validos = None
    operador = None
    operacionais_validos = '+-/*'

    try: 
            resolve1 = float(pergunta_1)
            resolve2 = float(pergunta_2)
            numeros_validos = True
    except:
        numeros_validos = None

    if numeros_validos == None:
        print('\nDigite apenas números válidos.')
        exit

    try:
        if pergunta_3 in operacionais_validos:
            operador = True
    except:
        operador = None

    if operador == None:
        print('\nOperador invalido')
        exit

    while operador and numeros_validos:
        if pergunta_3 == '+':
            print(f'\nSeu resultado é: {resolve1 + resolve2}')
            break   
        elif pergunta_3 == '-':
            print(f'\nSeu resultado é: {resolve1 - resolve2}')
            break
        elif pergunta_3 == '*':
            print(f'\nSeu resultado é: {resolve1 * resolve2}')
            break
        elif pergunta_3 == '/':
            print(f'\nSeu resultado é: {resolve1 / resolve2}')
            break

    sair = input('\nPara sair pressione [s]: ').lower()
    if sair != 's':
        continue
    else:  
        break

 


