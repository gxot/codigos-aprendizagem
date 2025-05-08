# Exercícios
# Crie funções que duplicam, triplicam e quadruplicam
# o número recebido como parâmetro.

numero = int(input('Número: '))
vezes = int(input('Por quanto: '))
resposta = numero * vezes

def multiplica(vezes):
    def quanto(numero):
        return numero * vezes
    return quanto

conta = multiplica(vezes)

print(conta(numero))
