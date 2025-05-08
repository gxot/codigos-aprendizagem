# TABUADA

numero_escolhido = int(input('Qual número vc quer saber a tabuada?'))

tabuada = [numero * numero_escolhido for numero in range(11)]


def conta(tabuada):
    print(f'A TABUADA DO {numero_escolhido}:')
    for i, numero in enumerate(tabuada):
        print(f'{numero_escolhido} x {i} = {numero}')

conta(tabuada)

