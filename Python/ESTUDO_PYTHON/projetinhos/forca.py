"""
Faça um jogo para o usuário adivinhar qual
a palavra secreta.
- Você vai propor uma palavra secreta
qualquer e vai dar a possibilidade para
o usuário digitar apenas uma letra.
- Quando o usuário digitar uma letra, você 
vai conferir se a letra digitada está
na palavra secreta.
    - Se a letra digitada estiver na
    palavra secreta; exiba a letra;
    - Se a letra digitada não estiver
    na palavra secreta; exiba *.
Faça a contagem de tentativas do seu
usuário.
"""
import os

palavrafixa = 'amo'
tentativas = 0
letra_certa = ''
numeros = '1234567890'

while True:

    letra_digitada = input('Tente adivinhar a palavra secreta, digite apenas uma letra: ')
    if len(letra_digitada) > 1:
        print('Digite apenas UMA letra.')
        continue
    elif letra_digitada in numeros:
        print('Digite apenas LETRAS')
        continue

    if letra_digitada in palavrafixa:
        letra_certa += letra_digitada
    
    palavra_formada = ''
    for letra in palavrafixa:
        if letra in letra_certa:
            palavra_formada += letra
        else:
            palavra_formada += '*'
    
    tentativas += 1
    
    print(f'Palavra formada: {palavra_formada}')
    
    if palavra_formada == palavrafixa:
        os.system('cls')
        print('VOCÊ GANHOU! PARABÉNS')
        print(f'A palavra era: {palavra_formada}')
        print(f'Tentativas: {tentativas}\n')
        tentativas = 0
        letra_certa = ''


