print('Bem-vindo ao seu carrinho de compras')
numeros = '1234567890'
pedido = 0

while True: 

    produto = str(input('\nDigite seu produto: '))
    if not produto:
        print('Produto inválido.')
        continue
    if produto in numeros:
        print('Nenhum produto nosso possui números no nome.')
        continue

    try:
        valor = float(input('Qual o valor dele?: '))
        if valor <= 0:
            print('Valor inválido, digite um valor maior que 0')
            continue
    except ValueError:
         print('Valor inválido, apenas números.')
         continue

    try:
        qtd = int(input('Digite a quantidade: '))
        if valor <= 0:
            print('Valor inválido, digite um valor maior que 0')
            continue
    except ValueError:
        print('Valor inválido, apenas números.')
        continue

    pedido += (valor * qtd)

    sair = input(
        '\nDeseja sair ou incluir mais algum produto?\n' 
        'Para sair digite a tecla [S]\n' 
        'Para incluir digite qualquer tecla: ' 
        ).lower()
    if 's' in sair:
        print(f'\nObrigado por comprar conosco, seu pedido deu R${pedido}')
        break
    else:
        continue
    