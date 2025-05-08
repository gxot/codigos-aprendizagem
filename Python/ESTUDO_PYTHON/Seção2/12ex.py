# Exercício - sistema de perguntas e respostas


perguntas = [
    {
        'Pergunta': 'Quanto é 2+2?',
        'Opções': ['1', '3', '4', '5'],
        'Resposta': '4',
    },
    {
        'Pergunta': 'Quanto é 5*5?',
        'Opções': ['25', '55', '10', '51'],
        'Resposta': '25',
    },
    {
        'Pergunta': 'Quanto é 10/2?',
        'Opções': ['4', '5', '2', '1'],
        'Resposta': '5',
    },
    {
        'Pergunta': 'Quanto é 1 + 1?',
        'Opções': ['4', '5', '2', '1'],
        'Resposta': '2',
    },
]

acerto = 0
for dic in perguntas:   

    print(dic['Pergunta'])

    for i, opt in enumerate(dic['Opções']):
        print(f'{i}) {opt}')

    resposta = int(input('Resposta: '))
    
    if dic['Opções'][resposta] == dic['Resposta']:
        print('\nVocê acertou!\n')
        acerto +=1 
    else:
        print('\nVocê errou\n')

print(f'Você acertou {acerto} de {len(perguntas)} perguntas')