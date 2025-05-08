print ('Contador de letras.')
frase = input('Insira uma frase: ')

i = 0
qtd_apareceu = 0
letra_atual = ''

while i < len(frase):
    
    letra_atual = frase[i]

    if letra_atual == ' ':
        i += 1
        continue

    qtd_apareceu_mais = frase.count(letra_atual)

    if qtd_apareceu < qtd_apareceu_mais:
        qtd_apareceu = qtd_apareceu_mais
        letra_apareceu_mais = letra_atual

    i += 1

print(
    f'A letra que mais apareceu foi "{letra_apareceu_mais}"'
    f' aparecendo {qtd_apareceu_mais}x'
    )

    